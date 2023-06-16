package com.babyboom.services;

import java.util.List;
import com.babyboom.entities.Role;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
