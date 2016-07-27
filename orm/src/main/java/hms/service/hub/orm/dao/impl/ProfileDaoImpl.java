package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.ProfileDao;
import hms.service.hub.orm.model.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by udara on 7/26/16.
 */

@Repository("profileDao")
public class ProfileDaoImpl extends UniversalDaoImpl<Profile> implements ProfileDao{
}
