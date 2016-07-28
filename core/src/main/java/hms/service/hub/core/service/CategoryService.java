package hms.service.hub.core.service;

import hms.service.hub.orm.model.Category;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
public interface CategoryService {
    Category getCategoryById(long id);
    //todo make this getAllCategories
    List<Category> getAllCategory();
}
