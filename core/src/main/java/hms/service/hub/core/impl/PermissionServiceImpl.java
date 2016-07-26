package hms.service.hub.core.impl;

import hms.service.hub.core.PermissionService;
import hms.service.hub.orm.dao.PermissionDao;
import hms.service.hub.orm.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Transactional
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public Permission findPermissionById(long id) {
        return permissionDao.findPermissionById(id);
    }

    @Override
    public List<Permission> findAllPermissions() {
        return permissionDao.findAllPermissions();
    }
}
