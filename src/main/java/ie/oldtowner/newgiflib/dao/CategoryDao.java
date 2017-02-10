package ie.oldtowner.newgiflib.dao;

import ie.oldtowner.newgiflib.model.Category;

import java.util.List;

/**
 * Created by walshejo on 03/02/2017.
 */
public interface CategoryDao {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}
