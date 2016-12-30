package woods.phone.fanera;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MagicDeCore on 01.12.2016.
 */
public class FaneraJDBCTemplate implements FaneraDAO {

    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;

    private final int NOMBER_PRODUCTS_ON_PAGE = 6;
    public int kol_vo_product;
    public int kol_vo_page_itogo;


    @Override
    public List<Fanera> getListFanera() {
        List<Fanera> faneraList = jdbcTemplateObject.query("SELECT * FROM fanera", new FaneraMapper());
        return faneraList;
    }

//    fanera.setId(rs.getInt("id"));
//        fanera.setName(rs.getString("name"));
//        fanera.setSize_format(rs.getString("size_format"));
//        fanera.setDepth(rs.getString("depth"));
//        fanera.setTreatment(rs.getString("treatment"));
//        fanera.setWater_resistance(rs.getString("water_resistance"));
//        fanera.setWetness(rs.getString("wetness"));
//        fanera.setMaterial(rs.getString("material"));
//        fanera.setImage(rs.getString("image"));
//        fanera.setDescription(rs.getString("description"));


//    public void insertFanera(Fanera fanera){
//        MapSqlParameterSource params = new MapSqlParameterSource();
//        params.addValue("name", fanera.getName());
//        params.addValue("size_format", fanera.getSize_format());
//        params.addValue("depth", fanera.getDepth());
//        params.addValue("treatment", fanera.getTreatment());
//        params.addValue("water_resistance", fanera.getWater_resistance());
//        params.addValue("wetness", fanera.getWetness());
//        params.addValue("material", fanera.getMaterial());
//        params.addValue("image", fanera.getImage());
//        params.addValue("description", fanera.getDescription());
//
//        jdbcTemplateObject.execute("INSERT INTO fanera VALUES (1, " + fanera.getName() + ", "
//                                                                    + fanera.getSize_format() + ", "
//                                                                    + fanera.getDepth() + ", "
//                                                                    + fanera.getTreatment() + ", "
//                +
//    }

    @Override
    public Fanera getFanera(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);
        Fanera fanera = jdbcTemplateObject.queryForObject("SELECT * FROM fanera where id=:id, ", params, new FaneraMapper());
        return fanera;
    }

    @Override
    public List<Fanera> listFanera(SelectFanera s) {
        //       MapSqlParameterSource params = new MapSqlParameterSource();
        String sql = "SELECT * FROM fanera";
        int k1 = 0;
        int k2 = 0;

        //0
        if (s.getShlef() == 1 || s.getNo_shlef() == 1 ||
                s.getSort() != "n" || s.getDepth() != "n"
                ) {
            sql += " where (manufacturer is not null) ";

            // 1
            if (s.getShlef() == 1 || s.getNo_shlef() == 1) {
                sql += "and (";
                if (s.getShlef() == 1) {
                    sql += "model='Шлифованная' ";
                    k1++;
                }
                if (s.getNo_shlef() == 1) {
                    if (k1 == 1) {
                        sql += " or ";
                        k1 = 0;
                    }
                    sql += "model='Нешлифованная' ";
                    k1++;
                }

                sql += " ) ";
            }

            //2
            if (!"n".equals(s.getSort()) || !"n".equals(s.getDepth())) {
                sql += " and ( ";
                if (!"n".equals(s.getSort())) {
                    sql += "color = '" + s.getDepth() + "'";
                    k2++;
                }
                if (!"n".equals(s.getDepth())) {
                    if (k2 == 1) {
                        sql += " and ";
                        k2 = 0;
                    }
                    sql += "ram_memory = " + s.getDepth();
                    k2++;
                }

                sql += " ) ";
            }

        }
        List<Fanera> listFanera = jdbcTemplateObject.query(sql, new FaneraMapper());
        return listFanera;
    }


    @Override
    public List<Fanera> listFanera(SelectFanera select, int page_nomber) {
        List<Fanera> listFanera = listFanera(select); // get

        int count = listFanera.size(); // nomber of products from question

        List<Fanera> listIphone2 = new ArrayList<Fanera>();

//add elements to list
        int finishProd = page_nomber * NOMBER_PRODUCTS_ON_PAGE;
        int startProd = page_nomber * NOMBER_PRODUCTS_ON_PAGE - NOMBER_PRODUCTS_ON_PAGE;

        for (int i = 0; i < listFanera.size(); i++) {
            if ((i >= startProd) && (i < finishProd))
                listIphone2.add(listFanera.get(i));
        }

        setKol_vo_product(listFanera.size());
        kol_vo_page_itogo = (int) Math.ceil((double) count / (double) NOMBER_PRODUCTS_ON_PAGE);
//       setKol_vo_page_itogo();
        return listIphone2;
    }


    public void setKol_vo_product(int kol_vo_product) {
        this.kol_vo_product = kol_vo_product;
    }

    public int getKol_vo_page_itogo() {
        return kol_vo_page_itogo;
    }

    public void setKol_vo_page_itogo(int kol_vo_page_itogo) {
        this.kol_vo_page_itogo = kol_vo_page_itogo;
    }

    public int getKol_vo_product() {
        return kol_vo_product;
    }

    public int getNOMBER_PRODUCTS_ON_PAGE() {
        return NOMBER_PRODUCTS_ON_PAGE;
    }


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }

    public void goGo(){

    }

    }


