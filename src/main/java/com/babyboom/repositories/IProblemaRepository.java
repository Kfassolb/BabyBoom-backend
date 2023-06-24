package com.babyboom.repositories;

import com.babyboom.entities.Problema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IProblemaRepository extends JpaRepository<Problema, Integer> {
    @Query("SELECT p FROM Problema p WHERE p.idApoderado = :idApoderado")
    List<Problema> findByApoderado(@Param("idApoderado") int idApoderado);
}