package com.project.idmji.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.FetchType.LAZY;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
//	@NotBlank(message = "Nombre is required")
	private String nombre;
	private String apellidos;
	private Instant fechaNac; 
	@NotEmpty(message = "Email is required")
//    @NotBlank(message = "Username is required")
    private String username;
//    @NotBlank(message = "Password is required")
    private String password;
    @Email
//    @NotEmpty(message = "Email is required")
    private String email;
    @ManyToOne(fetch = LAZY)
    private PaisResidencia paisResidencia;
    @ManyToOne(fetch = LAZY)
    private Ciudad ciudad;
    private boolean enabled;
    
}
