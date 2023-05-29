package com.babyboom.servicesimplement;

import com.babyboom.entities.Usuario;
import com.babyboom.repositories.IUsuarioRepository;
import com.babyboom.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public void insert(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(new Usuario());
    }
}
