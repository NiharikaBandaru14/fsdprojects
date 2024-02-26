package com.tcs.boot.model;
 
import java.util.Arrays; 
import java.util.Collection; 
import java.util.List; 
import java.util.stream.Collectors; 
 
import org.springframework.security.core.GrantedAuthority; 
import org.springframework.security.core.authority.SimpleGrantedAuthority; 
import org.springframework.security.core.userdetails.UserDetails; 
 
public class MyUserDetails implements UserDetails{ 
	private String userName; 
	private String password; 
	private boolean active; 
	private List<GrantedAuthority> authorities; 
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	
	public MyUserDetails() { 
	} 


	public MyUserDetails(User user) {
		super();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.active = user.isActive();
		this.authorities = Arrays.stream(user.getRoles().split(",")) 
		.map(SimpleGrantedAuthority::new) 
		.collect(Collectors.toList()); 

	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

 
}
