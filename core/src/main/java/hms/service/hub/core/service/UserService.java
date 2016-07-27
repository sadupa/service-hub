package hms.service.hub.core.service;

import hms.service.hub.orm.model.User;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface UserService {

    User getUserById(long id);

    User getUserByName(String name);

    List<User> getAllUsers();

    List<User> getAllActiveUsers();

    void createUser(User user);

    void updateUser(User user);

    void changePassword(long userId, String password);

    void activateUser(long id);

    void deactivateUser(long id);
}
