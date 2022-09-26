package crud.dao;

import crud.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void save(User user);
    User findById(long id);
    void update( User user);
    void delete(long id);
}


