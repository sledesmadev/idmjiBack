package com.project.idmji.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "paisesresidencia")
public class PaisResidencia {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String nombre;
	
}
