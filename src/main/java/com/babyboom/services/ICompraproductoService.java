package com.babyboom.services;

import com.babyboom.entities.Compraproducto;

import java.util.List;

public interface ICompraproductoService {

    public void insert(Compraproducto compraproducto);

    List<Compraproducto> list();

}

