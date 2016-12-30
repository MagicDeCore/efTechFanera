package woods.admin.productmanage.service;

import woods.admin.productmanage.model.FaneraAdding;

/**
 * Created by MagicDeCore on 26.12.2016.
 */
public interface FaneraAddingService {

    void save(FaneraAdding faneraAdding);

    FaneraAdding findByFaneraname(String faneraName);
}
