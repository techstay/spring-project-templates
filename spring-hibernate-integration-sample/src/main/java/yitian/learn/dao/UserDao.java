package yitian.learn.dao;


import yitian.learn.entity.User;

import java.util.List;

public interface UserDao {
    User find(int id);

    User findByUsername(String username);

    void add(User user);

    void update(User user);

    void delete(User user);

    List<User> findAll();
}
