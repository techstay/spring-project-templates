package yitian.learn.dao;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import yitian.learn.entity.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    private HibernateTemplate template;

    @Autowired
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public User find(int id) {
        return template.get(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        Session session = template.getSessionFactory().getCurrentSession();
        return session.bySimpleNaturalId(User.class).load(username);
    }

    @Override
    public void add(User user) {
        template.save(user);
    }

    @Override
    public void update(User user) {
        template.update(user);
    }

    @Override
    public void delete(User user) {
        template.delete(user);
    }

    @Override
    public List<User> findAll() {
        return template.loadAll(User.class);

    }
}
