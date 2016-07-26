package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.User;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface UserDao extends UniversalDao<User> {

    User findUserById(long id);

    List<User> findAllUsers();

    List<User> findAllActiveUsers();
}
