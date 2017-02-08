package yitian.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yitian.learn.dao.UserDao;
import yitian.learn.entity.User;

@Controller
public class MainController {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userDao.findAll());
        return "index";
    }

    @RequestMapping("/add")
    public String addUser(User user) {
        userDao.add(user);
        return "redirect:/";
    }
}
