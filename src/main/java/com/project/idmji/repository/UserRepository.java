package com.project.idmji.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.idmji.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String username);
}
