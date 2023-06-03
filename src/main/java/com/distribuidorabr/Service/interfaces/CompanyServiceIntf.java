package com.distribuidorabr.Service.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import com.distribuidorabr.Model.Company;

public interface CompanyServiceIntf {

	public ArrayList<Company> findAll();
	public Company findById(UUID id);
	public Company findByCnpj(String cnpj);
	public ArrayList<Company> findByCorporateName(String corporateName);
	public Company save(Company company);
	public Company update(Company company);
	public void delete(UUID id);
	public ArrayList<Company> findAllCustomers();
	public ArrayList<Company> findAllSuppliers();
}
