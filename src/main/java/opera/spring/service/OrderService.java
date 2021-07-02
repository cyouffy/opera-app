package opera.spring.service;

import java.util.List;
import opera.spring.model.Order;
import opera.spring.model.ShoppingCart;
import opera.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
