package crud.service;

import crud.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void save(User user);
    User findById(long id);
    void update(long id,User user);
    void delete(long id);
}
