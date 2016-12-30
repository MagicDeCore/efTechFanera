package woods.phone.fanera;


import java.util.List;

/**
 * Created by MagicDeCore on 01.12.2016.
 */
public interface FaneraDAO {

    public List<Fanera> getListFanera();

    public Fanera getFanera(int id);

    public List<Fanera> listFanera(SelectFanera s);

    public List<Fanera> listFanera(SelectFanera select, int page_nomber);


}
