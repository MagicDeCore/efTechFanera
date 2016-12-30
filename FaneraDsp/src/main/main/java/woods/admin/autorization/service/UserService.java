package woods.admin.autorization.service;

import woods.admin.autorization.model.User;

/**
 * Created by MagicDeCore on 19.12.2016.
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}

