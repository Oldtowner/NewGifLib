package ie.oldtowner.newgiflib.service;

import ie.oldtowner.newgiflib.model.Category;

import java.util.List;

/**
 * Created by walshejo on 03/02/2017.
 */
public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
