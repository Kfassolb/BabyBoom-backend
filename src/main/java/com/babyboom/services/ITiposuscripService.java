package com.babyboom.services;

import com.babyboom.entities.Producto;
import com.babyboom.entities.Tiposuscrip;

import java.util.List;

public interface ITiposuscripService {
    public void insert(Tiposuscrip tiposuscrip);
    List<Tiposuscrip> list();
    public void delete(int );

    public Producto listId(int );

}
