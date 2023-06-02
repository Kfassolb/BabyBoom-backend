package com.babyboom.repositories;


import com.babyboom.controllers.ProductoController;
import com.babyboom.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Integer> {

}
