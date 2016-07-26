package hms.service.hub.core;

import hms.service.hub.orm.model.Role;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface RoleService {

    Role getRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
