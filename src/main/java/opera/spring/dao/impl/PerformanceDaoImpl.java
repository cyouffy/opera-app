package opera.spring.dao.impl;

import opera.spring.dao.AbstractDao;
import opera.spring.dao.PerformanceDao;
import opera.spring.model.Performance;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PerformanceDaoImpl extends AbstractDao<Performance> implements PerformanceDao {
    public PerformanceDaoImpl(SessionFactory factory) {
        super(factory, Performance.class);
    }
}
