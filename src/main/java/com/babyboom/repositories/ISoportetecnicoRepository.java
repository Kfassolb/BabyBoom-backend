package com.babyboom.repositories;



import com.babyboom.controllers.ProductoController;
import com.babyboom.entities.Soportetecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoportetecnicoRepository extends JpaRepository <Soportetecnico, Integer> {
}
