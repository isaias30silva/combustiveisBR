package com.distribuidorabr.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.distribuidorabr.DAO.EmployeeDAO;
import com.distribuidorabr.Model.Employee;
import com.distribuidorabr.config.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	private final EmployeeDAO dao;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	public AuthenticationResponse register(Employee request) {
		Employee user = new Employee();
		user.setEmail(request.getEmail());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setCountry(request.getCountry());
		user.setState(request.getState());
		user.setName(request.getName());
		user.setPosition(request.getPosition());
		user.setStatus(request.getStatus());
		user.setCpf(request.getCpf());
		user.setPassword(passwordEncoder.encode(request.generatePassword()));
		user.setRole(request.getRole());
		
		var savedUser = dao.save(user);
		
		var jwtToken = jwtService.generateToken(savedUser);
		
		return AuthenticationResponse.builder().token(jwtToken).build();
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		authenticationManager.authenticate(
			new UsernamePasswordAuthenticationToken(
				request.getCpf(), 
				request.getPassword()));
		
		var user = dao.findByCpf(request.getCpf()).orElseThrow();
		var jwtToken = jwtService.generateToken(user);
		
		return AuthenticationResponse.builder().token(jwtToken).build();
	}

}
