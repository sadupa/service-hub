package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Tag;

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
public interface TagDao extends UniversalDao<Tag> {
    List<Tag> getAllTags();
    List<Tag> getTagsByIds(List<Long> ids);
}
