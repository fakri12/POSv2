package metier.entities.Service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metier.entities.Client;
import metier.entities.dto.TokenDto;
import metier.entities.repositories.ClientRepository;
import metier.entities.security.ClientDetailsServiceImp;
import metier.entities.security.Encription;
import net.bytebuddy.utility.RandomString;

@Service
@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientService implements UserDetailsService {
	@Autowired
	Encription encription;

	@Autowired
	private ClientRepository clientRepository;
	
	
    @Autowired
    private JavaMailSender mailSender;
 
      
    public void sendVerificationEmail(Client user, String siteURL)
            throws  UnsupportedEncodingException, MessagingException {
        String toAddress = user.getMail();
        String fromAddress = "pos2022hsf@gmail.com";
        String senderName = "POS";
        String subject = "Please verify your registration"; 
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your registration:<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "POS.";
         
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
         
        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);
        
        content = content.replace("[[name]]", user.getF_name());
        String verifyURL = siteURL + "/verify?code=" + user.getVerificationCode();
         
        content = content.replace("[[URL]]", verifyURL);
         
        helper.setText(content, true);
         
        mailSender.send(message);
         
    }
    
    
	@PostMapping
	public Client save(@RequestBody Client client) throws Exception {
		Client c = new Client();
		c = clientRepository.findByMail(client.getMail());
		if(c != null) {
			throw new Exception("the client is already exsit");
		}
		client.setPassowrd(encription.passwordEncoder().encode(client.getPassowrd()));
		String randomCode = RandomString.make(64);
        client.setVerificationCode(randomCode);
        client.setEnabled(false);
		clientRepository.save(client);
		sendVerificationEmail(client, "http://localhost:4200");
		return client;
	}
	

	@PostMapping("/verify")
	public boolean verifyUser(@RequestBody TokenDto code) {
		Client user = clientRepository.findByVerificationCode(code.getCode());
	    if (user != null) {
	        user.setEnabled(true);
	        user.setVerificationCode(null);
	        clientRepository.save(user);
	        return true;
	    } else {
	        return false;
	    }
	}
	
	@PostMapping("/getClient")
	public Client getDetailsClient(@RequestBody TokenDto email) {
		Client client = clientRepository.findByMail(email.getEmail());
		client.setPassowrd(null);
		return client;
	}
	@PostMapping("/getClientSocial")
	public Client getDetailsClient(String email) {
		Client client = clientRepository.findByMail(email);
		client.setPassowrd(null);
		return client;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Client client = clientRepository.findByMail(email);
		ClientDetailsServiceImp clientDetailsServiceImp = new ClientDetailsServiceImp(client);
		return clientDetailsServiceImp;
	}
	
	public boolean ifMailExsits(String mail) {
		return this.clientRepository.existsByMail(mail);
	}
	
	public Client getClientByMail(String mail) {
		return this.clientRepository.findByMail(mail);
	}
	
	public Client saveSocial(Client client) {
		client.setPassowrd(encription.passwordEncoder().encode(client.getPassowrd()));
		clientRepository.save(client);
		return client;
	}
	
}
