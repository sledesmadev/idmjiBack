package com.project.idmji.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.idmji.model.Ciudad;
import com.project.idmji.model.RefreshToken;


public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

	
}
