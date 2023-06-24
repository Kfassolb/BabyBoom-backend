package com.babyboom.repositories;

import com.babyboom.entities.Compra;
import com.babyboom.entities.Comunidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IComunidadRepository extends JpaRepository<Comunidad, Integer> {
    @Query("from Comunidad c where c.FechaInicio=:fechaInicio")
    List<Comunidad> findByDateComunidad(@Param("fechaInicio")LocalDate fechaInicio);


}
