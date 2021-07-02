package opera.spring.dao;

import java.util.List;
import opera.spring.model.Order;
import opera.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
