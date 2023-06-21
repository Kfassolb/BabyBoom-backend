package com.babyboom.servicesimplement;

import com.babyboom.entities.Users;
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
    public Integer insert(Users user) {
        int rpta = usuarioRepository.buscarUsername(user.getUsername());
        if (rpta == 0) {
            usuarioRepository.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return usuarioRepository.findAll();
    }

    /*@Override
    public void insert(Users usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Users> list() {
        return usuarioRepository.findAll();
    }*/

    @Override
    public void delete(int idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public Users listId(int idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(new Users());
    }
}
