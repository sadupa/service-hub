package hms.service.hub.core.service;

import hms.service.hub.orm.model.Profile;
import hms.service.hub.orm.model.User;

/**
 * Created by udara on 7/26/16.
 */

public interface ProfileService {

    Profile getProfileById(long id);

    Profile getProfileByUser(User user);

    Long createProfile(Profile profile);
}
