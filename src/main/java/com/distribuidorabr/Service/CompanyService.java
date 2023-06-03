package com.distribuidorabr.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.distribuidorabr.DAO.CompanyDAO;
import com.distribuidorabr.Exceptions.InvalidUpdateQueryException;
import com.distribuidorabr.Exceptions.NoQueryResultsException;
import com.distribuidorabr.Model.Company;
import com.distribuidorabr.Service.interfaces.CompanyServiceIntf;

@Service
public class CompanyService implements CompanyServiceIntf{

	@Autowired
	private CompanyDAO dao;
	
	@Override
	public ArrayList<Company> findAll() {
		ArrayList<Company> list = (ArrayList<Company>)dao.findAll(Sort.by(Sort.Direction.ASC, "corporateName"));
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para a busca selecionada");
	}

	@Override
	public Company findById(UUID id) {
		Optional<Company> res = dao.findById(id);
		if(res.isPresent()) {
			Company company = res.get();
			return company;
		}
		throw new InvalidUpdateQueryException("Não foram encontrados registros para o ID " + id);
	}

	@Override
	public Company findByCnpj(String cnpj) {
		Optional<Company> res = dao.findByCnpj(cnpj);
		if(res.isPresent()) {
			Company company = res.get();
			return company;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para o CNPJ " + cnpj);
	}

	@Override
	public ArrayList<Company> findByCorporateName(String corporateName) {
		ArrayList<Company> list = dao.findAllByCorporateNameContaining(corporateName);
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para o termo pesquisado");
	}
	
	@Override
	public Company save(Company company) {
		return dao.save(company);
	}

	@Override
	public Company update(Company company) {
		
		if(company.getId() != null && company.getCorporateName() != null) {
			return dao.save(company);
		} else {
			return null;
		}
		
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public ArrayList<Company> findAllCustomers() {
		ArrayList<Company> list = dao.findAllCustomers(Sort.by(Sort.Direction.ASC, "corporateName"));
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para a busca selecionada");
	}

	@Override
	public ArrayList<Company> findAllSuppliers() {
		ArrayList<Company> list = dao.findAllSuppliers(Sort.by(Sort.Direction.ASC, "corporateName"));
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para a busca selecionada");
	}

}
