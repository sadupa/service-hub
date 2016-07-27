package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.TagDao;
import hms.service.hub.orm.model.Tag;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (C) Copyright 2016 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 * <p/>
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 * <p/>
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 *
 * @Author Sadupa Wijeratne
 * Created on : 7/27/16 4:30 PM
 */

@Repository("tagDao")
public class TagDaoImpl extends UniversalDaoImpl<Tag> implements TagDao {
    @Override
    public List<Tag> getAllTags() {
        Session session = getCurrentSession();
        return session.createCriteria(Tag.class)
                .list();
    }
}
