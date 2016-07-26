package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Permission;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
public interface PermissionDao extends UniversalDao<Permission> {

    Permission findPermissionById(long id);

    List<Permission> findAllPermissions();
}
