package com.babyboom.repositories;

import com.babyboom.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico,Integer> {
    //listar medicos por especialidad
}
