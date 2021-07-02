package opera.spring.service;

import opera.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
