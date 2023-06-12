package com.babyboom.services;

import com.babyboom.entities.User;

import java.util.List;

public interface IUserService {
    public void insert (User usuario);
    List<User>list();
    public void delete(int idUsuario);
    public User listId(int idUsuario);
}
