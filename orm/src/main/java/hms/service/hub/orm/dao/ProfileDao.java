package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by udara on 7/26/16.
 */

@Repository("profileDao")
public interface ProfileDao extends UniversalDao<Profile>{


}