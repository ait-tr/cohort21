package de.aittr.users.controllers;

import de.aittr.users.dao.UsersDAO;
import de.aittr.users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private UsersDAO usersDAO=new UsersDAO();
    private List<User> users = usersDAO.getUsers();

    //   /user
    //  /user?city=Berlin
    @GetMapping(value = "/users")
    public String usersList(@RequestParam(name="city", required = false, defaultValue = "all") String city, Model model){
        List<User> res=users;
        if(!city.equals("all")){
            res=users.stream().filter(u-> u.getCity().equals(city)).toList();
        }
        model.addAttribute("users", res);
        return "users";
    }
    //     /users/2
    @GetMapping(value = "/users/{id}")
    public String UserById(@PathVariable int id,  Model model){
        List<User> res=new ArrayList<>();
        res.add(users.get(id));
        model.addAttribute("users", res);
        model.addAttribute("user_id", id);

        return "user-info";
    }

}
