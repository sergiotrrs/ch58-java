package com.monkey.tower.app.security.jwt;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
	
	private String SECRET_KEY = "NuestraClaveSecretaComoLaRecetaDeLaCangreburguer123#";

	public String generateToken(Authentication authentication) {
		// TODO generar el token
		
		return "Simulamos el toke Hola, soy el token! ";
	}
}
