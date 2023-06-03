package com.distribuidorabr.DTO;

import java.io.Serializable;

import com.distribuidorabr.Model.Employee;
import com.distribuidorabr.Model.Person;
import com.distribuidorabr.enums.Role;

/* 
 * This DTO doesn't have the 'password' attribute
 */
public class EmployeeResponseDTO extends Person implements Serializable{

	private static final long serialVersionUID = -461143291644800209L;

		private String name;
		
		private String cpf;
		
		private String position;
		
		private boolean status;
		
		private Role role;
		
		public EmployeeResponseDTO() {
		}
		
		public EmployeeResponseDTO(Employee employee) {
			this.id = employee.getId();
			this.email = employee.getEmail();
			this.state = employee.getState();
			this.country = employee.getCountry();
			this.phoneNumber = employee.getPhoneNumber();
			this.name = employee.getName();
			this.cpf = employee.getCpf();
			this.position = employee.getPosition();
			this.status = employee.getStatus();
			this.role = employee.getRole();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public Role getRole() {
			return role;
		}

		public void setRoles(Role role) {
			this.role = role;
		}
		
}
