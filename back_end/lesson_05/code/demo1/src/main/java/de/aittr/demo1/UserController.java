package de.aittr.demo1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
   static List<Users> users = new ArrayList<>(
           List.of(
                   new Users("Jack", "Berlin"),
                   new Users("Ann", "Paris"),
                   new Users("Nick", "Berlin"),
                   new Users("Tom", "Rostok")
           )
   );

    @GetMapping(value="/users")
    public String listUser(Model model){
        model.addAttribute("users",users);
        return "usersview";
    }

}
