package com.babyboom.services;

import com.babyboom.entities.Compra;

import java.util.List;

public interface ICompraService {
    public void insert(Compra compra);

    List<Compra>list();

    public void delete(int idCompra);

    public Compra listId(int idCompra);
}
