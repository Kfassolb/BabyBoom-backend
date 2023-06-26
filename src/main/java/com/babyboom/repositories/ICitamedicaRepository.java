package com.babyboom.repositories;

import com.babyboom.entities.Citamedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICitamedicaRepository extends JpaRepository<Citamedica,Integer> {
    @Query(value="select cm.lugar,count(cm.id_cita_medica) from citas cm\n" +
            "group by cm.lugar order by count (cm.lugar) desc", nativeQuery = true)
    List<String[]>getCountByplace();
}
