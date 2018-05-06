package moc.oreh.account.repository;

import moc.oreh.account.entity.User;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserRepository extends BaseRepository {

    public List<User> list(int pageNo, int pageSize) {
        Query query = currentSession().createQuery("from User")
                .setFirstResult((pageNo - 1) * pageSize)
                .setMaxResults(pageSize);
        return query.list();
    }
}
