package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Profile;
import hms.service.hub.orm.model.User;

/**
 * Created by udara on 7/26/16.
 */

public interface ProfileDao extends UniversalDao<Profile>{

    Profile findProfileById(long id);

    Profile findProfileByUser(User user);

}
