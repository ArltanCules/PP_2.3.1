package crud.dao;

import crud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private  EntityManager entityManager;

//    @Autowired
//    public UserDaoImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findById(long id) {
        TypedQuery<User> query = entityManager.createQuery(
                "select u from User u where u.id = :id", User.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update( User user) {
//        User user = findById(id);
//        user.setEmail(updateUser.getEmail());
//        user.setName(updateUser.getName());
//        user.setLast_name(updateUser.getLast_name());
        entityManager.merge(user);
    }

    @Override
    public void delete(long id) {
        User user = findById(id);
        entityManager.remove(user);
    }


}
