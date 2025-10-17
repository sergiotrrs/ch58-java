package com.monkey.tower.app.security;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.monkey.tower.app.model.User;
import com.monkey.tower.app.repository.UserRepository;
/**
 * Esta clase es el puente entre tu base de datos y Spring Security. 
 * Su única misión es buscar un usuario por su email y entregar 
 * sus detalles (contraseña y roles).
 */
@Service
public class JpaUserDetailsService implements UserDetailsService  {
	
	private final UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Busca al usuario en la base de datos por su email
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + username));

        // Convierte los roles de tu base de datos a un formato que Spring Security entiende (GrantedAuthority)
        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName().toUpperCase()))
                .collect(Collectors.toSet());

        // Devuelve un objeto UserDetails que Spring Security utiliza internamente
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                authorities);
	}

}
