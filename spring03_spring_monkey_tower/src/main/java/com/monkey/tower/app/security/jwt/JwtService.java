package com.monkey.tower.app.security.jwt;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	// Inyecta el valor de la clave secreta desde application.properties
	@Value("${spring.security.oauth2.resourceserver.jwt.secret-key}")
	private String SECRET_KEY;

	public String generateToken(Authentication authentication) {
		// Obtiene los roles del usuario autenticado
//      String authorities = authentication.getAuthorities().stream()
//              .map(GrantedAuthority::getAuthority)
//              .collect(Collectors.joining(" "));

		String authorities = "";
		for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
			authorities += grantedAuthority.getAuthority() + " ";
		}

		// final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
		SecretKey secretKey = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

		// Construye el token JWT
		return Jwts.builder().subject(authentication.getName())
				.expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 8))
				.claim("authorities", authorities)
				.signWith(secretKey).compact();

	}
}
