package hms.service.hub.core.impl;

import hms.service.hub.core.RoleService;
import hms.service.hub.orm.dao.RoleDao;
import hms.service.hub.orm.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getRoleById(long id) {
        return roleDao.findRoleById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.findAllRoles();
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.findRoleByName(name);
    }

    @Override
    public void createRole(Role role) {
        roleDao.save(role);
    }
}
