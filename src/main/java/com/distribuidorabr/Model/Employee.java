package com.distribuidorabr.Model;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.distribuidorabr.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee extends Person implements UserDetails{

	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100)
	@NotEmpty(message = "Campo obrigatório")
	@Size(max = 100, min = 10, message = "Nome deve conter entre 10 e 100 caracteres")
	private String name;

	@Column(nullable = false, length = 20)
	@NotEmpty(message = "Campo obrigatório")
	private String position;

	@Column(nullable = false)
	@NotNull(message = "Campo obrigatório")
	private boolean status;

	@Column(nullable = false, length = 15, unique = true)
	@NotEmpty(message = "Campo obrigatório")
	@CPF(message = "Necessário CPF válido")
	private String cpf;

	@Column(nullable = false)
	@NotEmpty(message = "Campo obrigatório")
	// @Size(max=15, min=4, message="Senha deve conter entre 4 e 15 caracteres")
	private String password;

	@Enumerated(value=EnumType.STRING)
	private Role role;
	
	//@OneToMany(mappedBy = "employee")
	//private List<Token> tokens;

	public Employee() {
		super();
	}

	public Employee(String name, String position, boolean status, String cpf, String password, Role role) {
		super();
		this.name = name;
		this.position = position;
		this.status = status;
		this.cpf = cpf;
		this.password = password;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String generatePassword() {
		// Default password generated is
		// the first 5 characters of employee's CPF
		return getCpf().substring(0, 5);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.name()));
	}

	@Override
	public String getUsername() {
		return this.cpf;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cpf);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

}
