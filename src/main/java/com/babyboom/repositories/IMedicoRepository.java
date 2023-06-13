package com.babyboom.repositories;

import com.babyboom.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico,Integer> {
    //listar medicos por especialidad
    @Query("select m from Medico m where m.especialidad=:especialidad")
    List<Medico> listarPorEspecialidad(@Param("especialidad") String especialidad);
}
