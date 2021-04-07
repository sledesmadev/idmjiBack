package com.project.idmji.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.idmji.model.Ciudad;
import com.project.idmji.model.Iglesia;
import com.project.idmji.model.RefreshToken;


public interface IglesiaRepository extends JpaRepository<Iglesia, Long> {

	List<Iglesia> findByCiudad(Long idCiudad);
	
}
