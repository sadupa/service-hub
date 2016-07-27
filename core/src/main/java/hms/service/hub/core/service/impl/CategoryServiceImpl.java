package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.CategoryService;
import hms.service.hub.orm.dao.CategoryDao;
import hms.service.hub.orm.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategory() {
        return categoryDao.getAllCategory();
    }
}
