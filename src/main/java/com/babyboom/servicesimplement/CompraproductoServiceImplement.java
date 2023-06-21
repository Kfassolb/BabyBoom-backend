package com.babyboom.servicesimplement;


import com.babyboom.entities.Compraproducto;
import com.babyboom.repositories.ICompraproductoRepository;
import com.babyboom.services.ICompraproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraproductoServiceImplement implements ICompraproductoService {

    @Autowired
    private ICompraproductoRepository cR;

    @Override
    public void insert(Compraproducto compraproducto) {cR.save(compraproducto);}

    @Override
    public List<Compraproducto> list() {return cR.findAll();}

}
