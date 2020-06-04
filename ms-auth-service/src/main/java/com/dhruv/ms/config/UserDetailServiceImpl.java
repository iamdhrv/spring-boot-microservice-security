package com.dhruv.ms.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dhruv.ms.model.User;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		final List<User> users = Arrays.asList(
				new User(1, "hk", encoder.encode("12345"), "USER"),
				new User(2, "admin", encoder.encode("12345"), "ADMIN")
			);
		
		for (User user : users) {
			if(user.getUsername().equals(username)) {
				List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_"+user.getRole());
				
				return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
			}
		}
		
		throw new UsernameNotFoundException("Username" + username + "Not Found.");
	
	}
	
	
}
