package com.distribuidorabr.Model;

import java.io.Serializable;
import java.util.Objects;

import com.distribuidorabr.Model.enums.BusinessRelationship;

public class Company extends Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String corporateName;
	private String cnpj;
	private BusinessRelationship businessRelationship;
	
	public Company() {
		super();
	}

	public Company(String corporateName, String cnpj, BusinessRelationship businessRelationship) {
		super();
		this.corporateName = corporateName;
		this.cnpj = cnpj;
		this.businessRelationship = businessRelationship;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public BusinessRelationship getBusinessRelationship() {
		return businessRelationship;
	}

	public void setBusinessRelationship(BusinessRelationship businessRelationship) {
		this.businessRelationship = businessRelationship;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj);
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
		Company other = (Company) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Company [corporateName=" + corporateName + ", cnpj=" + cnpj + ", businessRelationship="
				+ businessRelationship + ", id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", country=" + country + ", state=" + state + "]";
	}
	
}