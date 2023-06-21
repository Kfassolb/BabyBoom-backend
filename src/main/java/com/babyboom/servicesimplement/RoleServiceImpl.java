package com.babyboom.servicesimplement;

import com.babyboom.entities.Role;
import com.babyboom.repositories.IRoleRepository;
import com.babyboom.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRolService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
