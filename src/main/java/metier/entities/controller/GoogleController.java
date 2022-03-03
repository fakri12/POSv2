package metier.entities.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Value;

import metier.entities.Client;
import metier.entities.Service.ClientService;
import metier.entities.dto.TokenDto;

@RestController
@RequestMapping("/api")
public class GoogleController {
	
	@Autowired
	private ClientService clientService;
	private String email;
	
	@Value("${google.id}")
	private String idClient;
	
	@Value("{mysecret.password}")
	private String password;
	
	@PostMapping("/google")
	public ResponseEntity<?> loginWithGoogle(@RequestBody TokenDto tokenDto) throws IOException{
		NetHttpTransport transport = new NetHttpTransport();
		JacksonFactory factory = new JacksonFactory();
		GoogleIdTokenVerifier.Builder ver = new GoogleIdTokenVerifier.Builder(transport, factory).setAudience(Collections.singleton(idClient));
		
		GoogleIdToken googleIdToken = GoogleIdToken.parse(ver.getJsonFactory(), tokenDto.getToken());
		
		GoogleIdToken.Payload payload = googleIdToken.getPayload();
		
        email = payload.getEmail();
        Client user = new Client();
        if(clientService.ifMailExsits(email)){
            user = clientService.getClientByMail(email);
            clientService.getDetailsClient(email);
        } else {
            user = createUser(email);
        }
		return new ResponseEntity<>(payload, HttpStatus.OK);
		
	}
	
    private Client createUser(String email) {
        Client user = new Client();
        user.setMail(email);
        user.setPassowrd(password);
        return clientService.saveSocial(user);
    }
//	@PostMapping("/facebook")
//	public ResponseEntity<?> loginWithFacebook(@RequestBody TokenDto tokenDto){
//		Facebook facebook = new FacebookTemplate(tokenDto.getToken());
//		String [] data = {"email","name","picture"};
//		User user = facebook.fetchObject("me", User.class, data);
//		return new ResponseEntity<>(user, HttpStatus.OK);
//	}
}
