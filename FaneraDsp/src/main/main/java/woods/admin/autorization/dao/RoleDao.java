package woods.admin.autorization.dao;

import woods.admin.autorization.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MagicDeCore on 19.12.2016.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
