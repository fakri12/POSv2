package metier.entities.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Encription {
	@Bean
	public PasswordEncoder passwordEncoder (){
	    return new BCryptPasswordEncoder();
	}
}
