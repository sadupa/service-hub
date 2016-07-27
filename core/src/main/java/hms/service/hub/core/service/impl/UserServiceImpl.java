package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.dao.UserDao;
import hms.service.hub.orm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(long id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public List<User> getAllActiveUsers() {
        return userDao.findAllActiveUsers();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void changePassword(long userId, String password) {
        User user = userDao.findUserById(userId);
        user.setPassword(password);
        userDao.update(user);
    }

    @Override
    public void activateUser(long id) {
        User user = userDao.findUserById(id);
        user.setStatus(User.ACTIVE);
        userDao.update(user);
    }

    @Override
    public void deactivateUser(long id) {
        User user = userDao.findUserById(id);
        user.setStatus(User.INACTIVE);
        userDao.update(user);
    }
}
