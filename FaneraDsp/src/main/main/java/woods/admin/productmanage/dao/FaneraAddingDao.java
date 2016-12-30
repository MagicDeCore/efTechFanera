package woods.admin.productmanage.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import woods.admin.productmanage.model.FaneraAdding;

/**
 * Created by MagicDeCore on 26.12.2016.
 */

public interface FaneraAddingDao extends JpaRepository<FaneraAdding, Long> {
    FaneraAdding findByFaneraName(String name);
}