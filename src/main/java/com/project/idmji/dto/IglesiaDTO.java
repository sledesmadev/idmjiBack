package com.project.idmji.dto;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.project.idmji.model.Ciudad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IglesiaDTO {
	private String nombre;
    private Long idCiudad;
}
