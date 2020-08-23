package com.example.user.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.user.Model.User;
import com.example.user.Model.UserPrincipal;
import com.example.user.Repository.UserRepository;



@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<User> user=repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User 404");
		return user.map(UserPrincipal:: new).get();
		
	}

}