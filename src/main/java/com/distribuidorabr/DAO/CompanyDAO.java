package com.distribuidorabr.DAO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.distribuidorabr.Model.Company;

public interface CompanyDAO extends JpaRepository<Company, UUID> {

	Optional<Company> findByCnpj(String cnpj);
	Optional<Company> findByCorporateNameContaining(String corporateName);
	ArrayList<Company> findAllByCorporateNameContaining(String corporateName);

}
