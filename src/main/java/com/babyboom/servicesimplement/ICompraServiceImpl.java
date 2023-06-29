package com.babyboom.servicesimplement;


import com.babyboom.entities.Compra;
import com.babyboom.entities.Guarderia;
import com.babyboom.repositories.ICompraRepository;
import com.babyboom.services.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ICompraServiceImpl implements ICompraService {

    @Autowired
    private ICompraRepository cR;


    @Override
    public void insert(Compra compra) {
        cR.save(compra);
    }

    @Override
    public List<Compra> list() {
        return cR.findAll();
    }

    @Override
    public List<Compra> buscarFecha(LocalDate fecha) {
        return cR.findByDateCompra(fecha);
    }

    @Override
    public Compra listId(int idCompra) {
        return cR.findById(idCompra).orElse(new Compra());
    }
}
