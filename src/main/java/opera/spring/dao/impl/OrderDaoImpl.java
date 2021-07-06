package opera.spring.dao.impl;

import java.util.List;
import opera.spring.dao.AbstractDao;
import opera.spring.dao.OrderDao;
import opera.spring.exception.DataProcessingException;
import opera.spring.model.Order;
import opera.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {
    public OrderDaoImpl(SessionFactory factory) {
        super(factory, Order.class);
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        try (Session session = factory.openSession()) {
            Query<Order> getByUser = session.createQuery(
                    "SELECT DISTINCT o FROM orders o "
                            + "join fetch o.tickets t "
                            + "left join fetch t.performanceSession ms "
                            + "left join fetch ms.stage "
                            + "left join fetch ms.performance "
                            + "WHERE o.user = :user", Order.class);
            getByUser.setParameter("user", user);
            return getByUser.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Not found shopping cart for user " + user, e);
        }
    }
}
