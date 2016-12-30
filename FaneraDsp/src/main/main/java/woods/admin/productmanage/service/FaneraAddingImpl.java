package woods.admin.productmanage.service;

import woods.admin.productmanage.dao.FaneraAddingDao;
import woods.admin.productmanage.model.FaneraAdding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MagicDeCore on 26.12.2016.
 */

@Service
public class FaneraAddingImpl implements FaneraAddingService {

    @Autowired
    private FaneraAddingDao faneraAddingDao;


    @Override
    public void save(FaneraAdding faneraAdding) {

        faneraAddingDao.save(faneraAdding);

    }

    @Override
    public FaneraAdding findByFaneraname(String faneraName) {
        return faneraAddingDao.findByFaneraName(faneraName);
    }
}
