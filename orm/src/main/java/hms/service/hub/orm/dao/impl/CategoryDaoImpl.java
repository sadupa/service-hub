package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.CategoryDao;
import hms.service.hub.orm.model.Category;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
@Repository("categoryDao")
public class CategoryDaoImpl extends UniversalDaoImpl<Category> implements CategoryDao {
    @Override
    public List<Category> getAllCategory() {
        Session session = getCurrentSession();
        return session.createCriteria(Category.class)
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
                .addOrder(Order.asc("name"))
                .list();
    }
}
