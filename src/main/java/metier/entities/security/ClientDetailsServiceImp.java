package metier.entities.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import metier.entities.Client;

public class ClientDetailsServiceImp implements UserDetails {
	
	Client client;
	
	@Autowired
	public ClientDetailsServiceImp(Client client) {
		this.client = client;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		return null;
	}

	@Override
	public String getPassword() {
		return client.getPassowrd();
	}

	@Override
	public String getUsername() {
		return client.getMail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		return client.isEnabled();
	}

}
