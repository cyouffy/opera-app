package opera.spring.dao.impl;

import java.time.LocalDate;
import java.util.List;
import opera.spring.dao.AbstractDao;
import opera.spring.dao.PerformanceSessionDao;
import opera.spring.exception.DataProcessingException;
import opera.spring.model.PerformanceSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PerformanceSessionDaoImpl extends AbstractDao<PerformanceSession>
        implements PerformanceSessionDao {
    public PerformanceSessionDaoImpl(SessionFactory factory) {
        super(factory, PerformanceSession.class);
    }

    @Override
    public List<PerformanceSession> findAvailableSessions(Long performanceId, LocalDate date) {
        try (Session session = factory.openSession()) {
            Query<PerformanceSession> getAvailableSessions = session.createQuery(
                    "FROM PerformanceSession WHERE id = :id "
                            + "AND DATE_FORMAT(showTime, '%Y-%m-%d') = :date",
                    PerformanceSession.class);
            getAvailableSessions.setParameter("id", performanceId);
            getAvailableSessions.setParameter("date", date.toString());
            return getAvailableSessions.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Session for performance with id "
                    + performanceId + " and show date " + date + " not found", e);
        }
    }
}
