package com.monkey.tower.app.security.jwt;


import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JwtAuthConverter implements Converter<Jwt, AbstractAuthenticationToken> {

    @Override
    public AbstractAuthenticationToken convert(Jwt jwt) {
        // 1. Llama a la lógica de conversión por defecto para obtener los claims básicos.
        Collection<GrantedAuthority> authorities = extractAuthorities(jwt);

        // 2. Crea el token de autenticación final con los roles extraídos correctamente.
        return new JwtAuthenticationToken(jwt, authorities, jwt.getClaimAsString("sub"));
    }

    private Collection<GrantedAuthority> extractAuthorities(Jwt jwt) {
        // 3. Busca el claim "authorities" en el token.
        String authoritiesClaim = jwt.getClaimAsString("authorities");
        if (authoritiesClaim == null || authoritiesClaim.isBlank()) {
            return Collections.emptyList();
        }

        // 4. Lo convierte de un string ("ROLE_ADMIN ROLE_CUSTOMER") a una colección de GrantedAuthority.
//        return Arrays.stream(authoritiesClaim.split(" "))
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
        
        // 4. Crea una lista vacía para almacenar los resultados.
        List<GrantedAuthority> authorities = new ArrayList<>();

        // 5. Divide el string de roles en un array.
        String[] roles = authoritiesClaim.trim().split(" ");

        // 6. Itera sobre cada rol en el array usando un for mejorado.
        for (String role : roles) {
            // 4. Crea una nueva instancia de SimpleGrantedAuthority y la añade a la lista.
            authorities.add(new SimpleGrantedAuthority(role));
        }

        // 7. Devuelve la lista poblada.
        return authorities;
        
    }
}