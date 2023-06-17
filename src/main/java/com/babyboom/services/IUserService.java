package com.babyboom.services;

import java.util.List;

import com.babyboom.entities.Users;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
