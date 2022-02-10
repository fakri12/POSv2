package metier.entities.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metier.entities.Client;
import metier.entities.repositories.ClientRepository;
import metier.entities.security.ClientDetailsServiceImp;
import metier.entities.security.Encription;

@Service
@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientService implements UserDetailsService {
	@Autowired
	Encription encription;

	@Autowired
	private ClientRepository clientRepository;
	@PostMapping
	public Client save(@RequestBody Client client) {
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		client.setPassowrd(encription.passwordEncoder().encode(client.getPassowrd()));
		clientRepository.save(client);
		return client;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Client client = clientRepository.findByMail(email);
		ClientDetailsServiceImp clientDetailsServiceImp = new ClientDetailsServiceImp(client);
		return clientDetailsServiceImp;
	}
}
