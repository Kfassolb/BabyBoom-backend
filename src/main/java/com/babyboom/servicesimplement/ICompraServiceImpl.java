package com.babyboom.servicesimplement;

import com.babyboom.entities.Compra;
import com.babyboom.repositories.ICompraRepository;
import com.babyboom.services.ICompraService;
import com.babyboom.services.IGuarderiaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public void delete(int idCompra) {
        cR.deleteById(idCompra);
    }

    @Override
    public Compra listId(int idCompra) {
        return cR.findById(idCompra).orElse(new Compra());
    }
}
