package hms.service.hub.core;

import hms.service.hub.orm.model.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by udara on 7/26/16.
 */

@Service("profileService")
public interface ProfileService {
    Long createProfile(Profile profile);
}
