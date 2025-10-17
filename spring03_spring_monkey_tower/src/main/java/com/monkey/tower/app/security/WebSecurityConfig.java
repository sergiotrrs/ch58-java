package com.monkey.tower.app.security;

import com.monkey.tower.app.controller.RoleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;
import static org.springframework.security.config.Customizer.withDefaults;

/**
 * @EnableWebSecurity: habilita la configuración de seguridad web en una
 *                     aplicación Spring Boot.
 * @Configuration: contiene configuraciones para la aplicación, como
 *                 definiciones de beans y configuración de componentes, y que
 *                 debe ser considerada durante la inicialización del contexto
 *                 de la aplicación.
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	private final RoleController roleController;

	WebSecurityConfig(RoleController roleController) {
		this.roleController = roleController;
	}

	// @Bean
	UserDetailsService userDetailsService() {
		UserDetails sergio = User.builder().username("Sercholo")
				.password("$2a$10$zeoNjnnrm335ZBS4P./7zeDKxWrZu6zgntcCPe4ZIe/wjlFwa83/K").roles("CHOLO").build();

		UserDetails tania = User.builder().username("Pericles")
				.password("$2a$10$zeoNjnnrm335ZBS4P./7zeDKxWrZu6zgntcCPe4ZIe/wjlFwa83/K").roles("ADMIN").build();

		UserDetails myuser = User.builder().username("myuser")
				.password("$2a$10$zeoNjnnrm335ZBS4P./7zeDKxWrZu6zgntcCPe4ZIe/wjlFwa83/K").roles("CUSTOMER").build();

		return new InMemoryUserDetailsManager(sergio, tania, myuser);
	}

	/**
	 * Crear un bean de BCryptPasswordEncoder. BCrypPasswordEncoder es una
	 * implementación de PasswordEncoder proporcionada por Spring Security. Se
	 * utiliza para codificar y verificar contraseñas utilizando el algoritmo de
	 * hashing bcrypt. El algoritmo incorpora un sal aleatoria por cada contraseña,
	 * lo que agrega un capa adicional de seguridad.
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        // Expone el gestor de autenticación de Spring para que lo podamos usar en nuestro controlador de login.
        return config.getAuthenticationManager();
    }

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		return http
				// Deshabilita CSRF porque las APIs REST stateless no lo necesitan si usan tokens.
				.csrf( csrf -> csrf.disable() )
				// Modificar las rutas públicas y privadas
				.authorizeHttpRequests( auth ->auth
						// Rutas públicas
						.requestMatchers("/api/v1/auth/login").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users").permitAll()
						
						// Rutas exclusivas para ADMIN
						.requestMatchers("/api/v1/roles/**").hasRole("ADMIN")
						.requestMatchers("/h2-console/**").hasRole("ADMIN")
						// .requestMatchers(HttpMethod.GET,"/api/v1/users").hasRole("ADMIN")
						
						// Rutas para los clientes
						.requestMatchers(
								"/api/v1/users/**"
								, "/api/v1/purchases/**"
								, "/api/v1/purchase_has_products").hasAnyRole("ADMIN", "CUSTOMER")
						// Cualquier otra petición debe ser autenticada
						.anyRequest().authenticated()						
						)
                		// Le dice a Spring que no cree ni use sesiones HTTP. Cada petición es independiente.
                		.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                		.httpBasic( withDefaults() ) 
                		.build();                
	}

}
