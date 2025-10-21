package com.monkey.tower.app.security.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	
	/**
	 * La clase record (Java16) es una forma corta y directa de crear clases
	 * inmutables. Son perfectas para DTOs.
	 * La clase nos genera automáticamente:
	 * - Constructor con atributos
	 * - getters
	 * - equals
	 * - hashCode
	 * - toString
	 */
	public record LoginRequest(String email, String password) {}
	public record JwtResponse(String token) {}
	
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	public AuthController(JwtService jwtService, AuthenticationManager authenticationManager) {
		this.jwtService = jwtService;
		this.authenticationManager = authenticationManager;
	}

	@PostMapping("/login")
	public ResponseEntity<JwtResponse> authentication(@RequestBody LoginRequest loginRequest){
		
		var authToken = new UsernamePasswordAuthenticationToken(
				loginRequest.email, 
				loginRequest.password
				);
		
		// Validar si la autenticación es exitosa (manejado por Spring)
		Authentication authentication= authenticationManager.authenticate(authToken);
		
		String jwt = jwtService.generateToken(authentication);
		
		return ResponseEntity.ok(new JwtResponse(jwt));
		
		
	}
	
    

}
