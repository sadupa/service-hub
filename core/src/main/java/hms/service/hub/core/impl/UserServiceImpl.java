package hms.service.hub.core.impl;

import hms.service.hub.core.UserService;
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
}
