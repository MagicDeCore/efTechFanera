package woods.admin.autorization.service;

/**
 * Created by MagicDeCore on 19.12.2016.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
