package de.aittr.users.dao;

import de.aittr.users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

    public List<User> getUsers(){
        List<User> list = new ArrayList<>(
           List.of(
               new User("Jack", "Berlin"),
               new User("Nick", "Paris"),
               new User("Lena", "Berlin"),
               new User("Ted", "Oslo")
           )
        );
        return list;
    }

}
