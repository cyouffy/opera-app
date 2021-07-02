package opera.spring.dao.impl;

import opera.spring.dao.AbstractDao;
import opera.spring.dao.StageDao;
import opera.spring.model.Stage;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StageDaoImpl extends AbstractDao<Stage> implements StageDao {
    public StageDaoImpl(SessionFactory factory) {
        super(factory, Stage.class);
    }
}
