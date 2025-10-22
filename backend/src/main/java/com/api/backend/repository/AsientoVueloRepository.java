package com.api.backend.repository;

import com.api.backend.entity.AsientoVuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsientoVueloRepository extends JpaRepository<AsientoVuelo, Long> {

    List<AsientoVuelo> findByVueloIdVueloAndDisponible(Long idVuelo, boolean disponible);

    @Query("SELECT av FROM AsientoVuelo av WHERE av.vuelo.idVuelo = :idVuelo AND av.disponible = true")
    List<AsientoVuelo> findAsientosDisponiblesByVuelo(@Param("idVuelo") Long idVuelo);

    long countByVueloIdVueloAndDisponible(Long idVuelo, boolean disponible);
}