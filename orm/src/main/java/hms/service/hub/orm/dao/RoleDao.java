package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Role;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface RoleDao extends UniversalDao<Role> {

    Role findRoleById(long id);

    List<Role> findAllRoles();

    Role findRoleByName(String name);
}
