package com.babyboom.repositories;

import com.babyboom.entities.Comunidad;
import com.babyboom.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer> {

    @Query(value = "SELECT p.tituloPublicacion,count(c.idComunidad) from publicaciones p \n" +
            "join comunidades c on  p.idComunidad = c.idComunidad \n" +
            "group by p.tituloPublicacion ORDER BY COUNT(p.tituloPublicacion) DESC", nativeQuery = true)
    List<String[]> getcomunidadCountBytitulo();
}