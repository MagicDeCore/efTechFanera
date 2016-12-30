package woods.phone.fanera;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MagicDeCore on 01.12.2016.
 */
public  class FaneraMapper implements RowMapper<Fanera> {


    @Override
    public Fanera mapRow(ResultSet rs, int i) throws SQLException {


        Fanera fanera = new Fanera();

        fanera.setId(rs.getInt("id"));
        fanera.setName(rs.getString("faneraname"));
        fanera.setSize_format(rs.getString("size_format"));
        fanera.setDepth(rs.getString("depth"));
        fanera.setTreatment(rs.getString("treatment"));
        fanera.setWater_resistance(rs.getString("water_resistance"));
        fanera.setWetness(rs.getString("wetness"));
        fanera.setMaterial(rs.getString("material"));
        fanera.setImage(rs.getByte("image"));
        fanera.setDescription(rs.getString("description"));

        return fanera;
    }
}