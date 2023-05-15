package de.aittr.users.dao;

import de.aittr.users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    List<User> list;

    public UsersDAO() {
        list = new ArrayList<>(
                List.of(
                        new User("Jack", "Berlin"),
                        new User("Nick", "Paris"),
                        new User("Lena", "Berlin"),
                        new User("Ted", "Oslo")
                )
        );
    }

    public List<User> getUsers(){
        return list;
    }

    public User get(int id){
       return list.stream().filter(user -> user.getId()==id).findAny().get();
    }

    public void remove(int id){
        list.removeIf(user -> user.getId()==id);
    }

    public void add(User user){
        list.add(user);
    }


    public void edit(User user, int id) {
         int index = list.indexOf(get(id));
         list.set(index, user);

    }
}
