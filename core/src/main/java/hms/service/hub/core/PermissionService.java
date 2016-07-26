package hms.service.hub.core;

import hms.service.hub.orm.model.Permission;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface PermissionService {

    Permission findPermissionById(long id);

    List<Permission> findAllPermissions();
}
