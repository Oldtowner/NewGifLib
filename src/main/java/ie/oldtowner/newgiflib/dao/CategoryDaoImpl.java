package ie.oldtowner.newgiflib.dao;

import ie.oldtowner.newgiflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by walshejo on 03/02/2017.
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> findAll() {
        //Open session
        Session session = sessionFactory.openSession();

        //Get all categories with a Hibernate Criteria
        CriteriaBuilder builder = session.getCriteriaBuilder();

        // UPDATED: Create CriteriaQuery
        CriteriaQuery<Category> criteria = builder.createQuery(Category.class);

        // UPDATED: Specify criteria root
        criteria.from(Category.class);

        // UPDATED: Execute query
        List<Category> categories = session.createQuery(criteria).getResultList();

        // Close session
        session.close();

        return categories;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {
        //Open session
        Session session = sessionFactory.openSession();
        //Begin transaction
        session.beginTransaction();
        //save category
        session.save(category);
        //commit
        session.getTransaction().commit();
        //close session
        session.close();
    }

    @Override
    public void delete(Category category) {

    }
}
