package moc.oreh.account.repository;

import moc.oreh.account.entity.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public <T extends BaseEntity> T get(Class<T> entityType, long id) {
        return currentSession().get(entityType, id);
    }

    public <T extends BaseEntity> void saveOrUpdate(T entity) {
        currentSession().saveOrUpdate(entity);
    }

    public <T extends BaseEntity> void delete(T entity) {
//        entity.setDeleted(true);
//        saveOrUpdate(entity);
        currentSession().delete(entity);
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}

