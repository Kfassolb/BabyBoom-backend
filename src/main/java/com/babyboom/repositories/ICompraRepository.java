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
    @Query("from Compra c where c.Fecha=:fecha")
    List<Compra> findByDateCompra(@Param("fecha")LocalDate fecha);

    @Query(value= "SELECT c.venta_total, COUNT(a.id_apoderado) from compra c \n" +
            "join apoderados a on c.id_apoderado = a.id_apoderado \n" +
            "WHERE c.venta_total>=1300 \n"+
            "GROUP BY c.venta_total ORDER BY COUNT(c.venta_total) DESC",nativeQuery = true)
    List<String[]> getCountApoderados();
}
