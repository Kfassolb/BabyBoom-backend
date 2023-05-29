package com.babyboom.services;

import com.babyboom.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert (Usuario usuario);
    List<Usuario>list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
}
