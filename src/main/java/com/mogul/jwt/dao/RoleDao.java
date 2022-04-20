package com.mogul.jwt.dao;

import com.mogul.jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, String > {

}
