package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.UserDao;
import hms.service.hub.orm.model.User;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Repository("userDao")
public class UserDaoImpl extends UniversalDaoImpl<User> implements UserDao {

    @Override
    public User findUserById(long id) {
        Session session = getCurrentSession();
        return (User) session.createCriteria(User.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public User findUserByName(String name) {
        Session session = getCurrentSession();
        return (User) session.createCriteria(User.class).add(Restrictions.eq("name", name)).uniqueResult();
    }

    @Override
    public List<User> findAllUsers() {
        Session session = getCurrentSession();
        return session.createCriteria(User.class).list();
    }

    @Override
    public List<User> findAllActiveUsers() {
        Session session = getCurrentSession();
        return session.createCriteria(User.class).add(Restrictions.eq("status", User.ACTIVE)).list();
    }
}