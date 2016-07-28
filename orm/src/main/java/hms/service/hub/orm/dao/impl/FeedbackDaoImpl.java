package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.FeedbackDao;
import hms.service.hub.orm.model.Feedback;
import org.springframework.stereotype.Repository;

/**
 * Created by yasitha on 7/29/16.
 */
@Repository("feedbackDao")
public class FeedbackDaoImpl extends UniversalDaoImpl<Feedback> implements FeedbackDao {

}
