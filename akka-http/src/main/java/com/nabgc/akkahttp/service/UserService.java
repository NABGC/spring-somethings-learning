package com.nabgc.akkahttp.service;

import com.nabgc.akkahttp.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final static List<User> users = new ArrayList<User>();

    static {
        users.add(new User(10001l, "曹操"));
        users.add(new User(10002l, "关羽"));
        users.add(new User(10003l, "张飞"));
        users.add(new User(10004l, "李逵"));
        users.add(new User(10005l, "花荣"));
        users.add(new User(10006l, "燕青"));
    }

    public Optional<User> getUser(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public boolean createUser(User user){
        users.add(user);
        return true;
    }

    public static List<User> getUsers() {
        return users;
    }
}
