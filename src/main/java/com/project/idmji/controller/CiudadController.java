package com.project.idmji.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.idmji.dto.AuthenticationResponse;
import com.project.idmji.dto.LoginRequest;
import com.project.idmji.dto.RefreshTokenRequest;
import com.project.idmji.dto.RegisterRequest;
import com.project.idmji.model.Ciudad;
import com.project.idmji.service.AuthService;
import com.project.idmji.service.CiudadService;
import com.project.idmji.service.RefreshTokenService;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/ciudad")
@AllArgsConstructor
@Component
public class CiudadController {
	
    private final CiudadService ciudadService;
    
    @GetMapping("")
    public List<Ciudad> signup() {
        return ciudadService.getAll();
//        return new ResponseEntity(OK);
    }

    
}
