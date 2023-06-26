package com.babyboom.repositories;

import com.babyboom.entities.Guarderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGuarderiaRepository extends JpaRepository<Guarderia,Integer> {
    @Query(value = "SELECT g.lugar, count(g.id_guarderia) from guarderia g \n" +
            "GROUP BY g.lugar ORDER BY COUNT(g.lugar) DESC", nativeQuery = true)
    List<String[]> getSideCountByGuarderia();

}