package woods.admin.autorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import woods.admin.autorization.model.User;

/**
 * Created by MagicDeCore on 19.12.2016.
 */

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}