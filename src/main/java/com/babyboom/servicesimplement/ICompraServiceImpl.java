package com.babyboom.servicesimplement;

import com.babyboom.entities.Compra;
import com.babyboom.repositories.ICompraRepository;
import com.babyboom.services.ICompraService;
import com.babyboom.services.IGuarderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @java.lang.Override
    public List<Compra> buscarFecha(LocalDate fecha) {
        return cR.findByDateCompra(fecha);
    }


}
