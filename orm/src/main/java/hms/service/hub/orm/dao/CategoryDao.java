package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Category;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
public interface CategoryDao extends UniversalDao<Category> {
    List<Category> getAllCategory();

}
