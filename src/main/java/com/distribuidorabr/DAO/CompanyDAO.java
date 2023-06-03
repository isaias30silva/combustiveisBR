package com.distribuidorabr.DAO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.distribuidorabr.Model.Company;

public interface CompanyDAO extends JpaRepository<Company, UUID> {

	Optional<Company> findByCnpj(String cnpj);
	ArrayList<Company> findAllByCorporateNameContaining(String corporateName);
	@Query("SELECT c FROM Company c WHERE c.businessRelationship = 'CUSTOMER'")
	ArrayList<Company> findAllCustomers(Sort sort);
	@Query("SELECT c FROM Company c WHERE c.businessRelationship = 'SUPPLIER'")
	ArrayList<Company> findAllSuppliers(Sort sort);

}
