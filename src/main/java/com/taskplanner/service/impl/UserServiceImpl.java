package com.taskplanner.service.impl;

import com.taskplanner.model.User;
import com.taskplanner.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new CopyOnWriteArrayList<>();

    public UserServiceImpl(){
        users.add(new User("juan@mail.com","test","Juan"));
        users.add(new User("julian@mail.com","test","Julian"));
        users.add(new User("david@mail.com","testdavid","David"));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        for(User user: users){
            if(user.getEmail().equals(userId)) return  user;
        }
        return null;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        User u = getById(user.getEmail());
        u.setPassword(user.getPassword());
        return u;
    }

    @Override
    public void remove(String userId) {

    }
}
