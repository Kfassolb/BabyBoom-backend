package com.babyboom.services;

import com.babyboom.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);
    List<Users> list();
    /*public void insert (User usuario);
    List<User>list();*/
    public void delete(int idUsuario);
    public Users listId(int idUsuario);
}
