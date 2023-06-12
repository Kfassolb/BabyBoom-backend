package com.babyboom.servicesimplement;

import com.babyboom.entities.User;
import com.babyboom.repositories.IUserRepository;
import com.babyboom.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository usuarioRepository;

    @Override
    public void insert(User usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<User> list() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public User listId(int idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(new User());
    }
}
