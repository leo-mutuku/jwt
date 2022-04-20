package com.mogul.jwt.service;

import com.mogul.jwt.dao.UserDao;
import com.mogul.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }

}
