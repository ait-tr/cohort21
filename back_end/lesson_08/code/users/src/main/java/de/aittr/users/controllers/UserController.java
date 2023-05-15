package de.aittr.users.controllers;

import de.aittr.users.dao.UsersDAO;
import de.aittr.users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        User res= usersDAO.get(id);
        model.addAttribute("user", res);
        model.addAttribute("user_id", id);

        return "user-info";
    }


    @GetMapping(value = "/susers")
    @ResponseBody
    public List<User> usersList1(@RequestParam(name="city", required = false, defaultValue = "all") String city, Model model){
        List<User> res=users;
        if(!city.equals("all")){
            res=users.stream().filter(u-> u.getCity().equals(city)).toList();
        }
        model.addAttribute("users", res);
        return res;
    }

    @DeleteMapping(value = "/users/{id}")
    public String removeUser(@PathVariable int id){
        usersDAO.remove(id);
        System.out.println("Remove user"+ id);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/new")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create-user-form";
    }

    @PostMapping(value = "/users")
    public String addUser( @ModelAttribute("user")  User user){
        usersDAO.add(user);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/edit/{id}")
    public String editUserForm(@PathVariable  int id, Model model){

        model.addAttribute("user", usersDAO.get(id));
        return "edit-user-form";
    }

    @PutMapping(value = "/users/{id}")
    public String editUser(@ModelAttribute("user") User user, @PathVariable int id){
        System.out.println("Edit user");
        usersDAO.edit(user,id);
        return "redirect:/users";
    }



}
