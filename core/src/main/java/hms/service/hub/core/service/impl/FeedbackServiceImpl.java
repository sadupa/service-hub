package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.FeedbackService;
import hms.service.hub.orm.dao.FeedbackDao;
import hms.service.hub.orm.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yasitha on 7/29/16.
 */
@Service("feedbackService")
@Transactional
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackDao feedbackDao;

    @Override
    public void saveFeedback(Feedback feedback) {
        feedbackDao.save(feedback);
    }
}
