package metier.entities.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;

import metier.entities.Service.ClientService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private ClientService clientService;
	@Autowired
	Encription encription;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.authenticationProvider(authenticationProvider());
	}
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and().authorizeRequests().antMatchers("/login","/composants/**","**/client","/categories/**","/paniers/**","/culasses/**","/lignePanierCommandes/**","/clients/**").permitAll().anyRequest().authenticated().and()
        .addFilter(new JWTAuthenticationFilter(authenticationManager()))
        .addFilterBefore(new JWTAuthorizationFiler(), UsernamePasswordAuthenticationFilter.class);
	}
	
	@Bean
	DaoAuthenticationProvider authenticationProvider (){
	    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
	    daoAuthenticationProvider.setPasswordEncoder(encription.passwordEncoder());
	    daoAuthenticationProvider.setUserDetailsService(clientService);
	    return daoAuthenticationProvider;
	}
	
}
