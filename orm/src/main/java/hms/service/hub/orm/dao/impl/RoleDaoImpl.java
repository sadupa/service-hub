package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.RoleDao;
import hms.service.hub.orm.model.Role;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Repository("roleDao")
public class RoleDaoImpl extends UniversalDaoImpl<Role> implements RoleDao {

    @Override
    public Role findRoleById(long id) {
        Session session = getCurrentSession();
        return (Role) session.createCriteria(Role.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public List<Role> findAllRoles() {
        Session session = getCurrentSession();
        return session.createCriteria(Role.class).list();
    }

    @Override
    public Role findRoleByName(String name) {
        Session session = getCurrentSession();
        return (Role) session.createCriteria(Role.class).add(Restrictions.eq("name", name)).uniqueResult();
    }
}
