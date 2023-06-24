package com.babyboom.repositories;


import com.babyboom.controllers.ProductoController;
import com.babyboom.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IProductoRepository extends JpaRepository <Producto, Integer> {

    @Query("SELECT p FROM Producto p WHERE p.PrecioU BETWEEN ?1 AND ?2")
    List<Producto> findByPrecioUBetween(int minPrecioU, int maxPrecioU);
}