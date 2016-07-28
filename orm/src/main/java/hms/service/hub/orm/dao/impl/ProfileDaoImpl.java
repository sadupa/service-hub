package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.ProfileDao;
import hms.service.hub.orm.model.Profile;
import hms.service.hub.orm.model.User;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by udara on 7/26/16.
 */

@Repository("profileDao")
public class ProfileDaoImpl extends UniversalDaoImpl<Profile> implements ProfileDao{

    @Override
    public Profile findProfileById(long id) {
        Session session = getCurrentSession();
        return (Profile) session.createCriteria(Profile.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public Profile findProfileByUser(User user) {
        Session session = getCurrentSession();
        return (Profile) session.createCriteria(Profile.class).add(Restrictions.eq("user", user)).uniqueResult();
    }
}
