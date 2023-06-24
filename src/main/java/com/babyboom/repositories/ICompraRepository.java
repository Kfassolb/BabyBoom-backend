package com.babyboom.repositories;

import com.babyboom.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICompraRepository extends JpaRepository<Compra,Integer> {
    @Query("from Compra c where c.fecha=:fecha")
    List<Compra> findByDateCompra(@Param("fecha")LocalDate fecha);
}
