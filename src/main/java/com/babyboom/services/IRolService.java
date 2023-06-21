package com.babyboom.services;

import com.babyboom.entities.Role;

import java.util.List;

public interface IRolService {
    public void insert(Role role);

    List<Role> list();
}
