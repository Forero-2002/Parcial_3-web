package com.juanforero.parcial.repository;

import com.juanforero.parcial.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}
