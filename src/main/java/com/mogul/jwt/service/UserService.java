package com.mogul.jwt.service;

import com.mogul.jwt.dao.RoleDao;
import com.mogul.jwt.dao.UserDao;
import com.mogul.jwt.entity.Role;
import com.mogul.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {


    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserDao userDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User role");
        roleDao.save(userRole);


        User adminUser = new User();
        adminUser.setUserName("Admin123");
        adminUser.setFirstName("Admin");
        adminUser.setLastName("Admin");
        adminUser.setPassword("admin@pass");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        userDao.save(adminUser);


        User user = new User();
        user.setUserName("User123");
        user.setFirstName("User");
        user.setLastName("User");
        user.setPassword("user@pass");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        userDao.save(user);
    }

}
