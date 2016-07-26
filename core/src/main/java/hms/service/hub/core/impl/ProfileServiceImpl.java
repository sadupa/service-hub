package hms.service.hub.core.impl;

import hms.service.hub.core.ProfileService;
import hms.service.hub.orm.dao.ProfileDao;
import hms.service.hub.orm.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by udara on 7/26/16.
 */

@Service("profileService")
@Transactional
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    ProfileDao profileDao;

    public Long createProfile(Profile profile) {
        return profileDao.save(profile);
    }
}
