package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.PermissionDao;
import hms.service.hub.orm.model.Permission;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Repository("permissionDao")
public class PermissionDaoImpl extends UniversalDaoImpl<Permission> implements PermissionDao {

    @Override
    public Permission findPermissionById(long id) {
        Session session = getCurrentSession();
        return (Permission) session.createCriteria(Permission.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public List<Permission> findAllPermissions() {
        Session session = getCurrentSession();
        return session.createCriteria(Permission.class).list();
    }
}
