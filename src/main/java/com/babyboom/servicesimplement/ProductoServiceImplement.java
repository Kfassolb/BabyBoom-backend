package com.babyboom.servicesimplement;

import com.babyboom.entities.Producto;
import com.babyboom.repositories.IProductoRepository;
import com.babyboom.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {
    @Autowired
    private IProductoRepository pR;

    @Override
    public void insert(Producto producto){pR.save(producto); }

    @Override
    public List<Producto> list(){return pR.findAll();}

    @Override
    public void delete(int idProducto){pR.deleteById(idProducto); }

    @Override
    public Producto listId(int IdProducto){return pR.findById(IdProducto).orElse(new Producto()); }

}
