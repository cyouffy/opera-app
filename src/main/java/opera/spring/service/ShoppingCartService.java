package opera.spring.service;

import opera.spring.model.PerformanceSession;
import opera.spring.model.ShoppingCart;
import opera.spring.model.User;

public interface ShoppingCartService {
    void addSession(PerformanceSession performanceSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
