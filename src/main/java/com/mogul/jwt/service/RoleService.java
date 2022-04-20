package com.mogul.jwt.service;

import com.mogul.jwt.dao.RoleDao;
import com.mogul.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role){
       return roleDao.save(role);

    }
}
