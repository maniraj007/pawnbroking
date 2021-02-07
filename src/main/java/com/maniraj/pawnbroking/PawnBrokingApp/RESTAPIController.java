package com.maniraj.pawnbroking.PawnBrokingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RESTAPIController {
	@Autowired
	ClientService repository;
	@Autowired
	AddressRepository addressRepo;

	@RequestMapping("/")
	public String index() {
		StringBuilder sb = new StringBuilder();
		for (Clients customer : repository.findAll()) {
			sb.append(customer.toString());
		}
		return sb.toString();
	}

	@RequestMapping("/save")
	public String saveResult() {
		Address address = new Address(Math.random()+"");
		addressRepo.save(address);
		repository.save(new Clients("abc","def", address));
		return "Save successful";
	}

	@RequestMapping("/{id}")
	public String getByID(@PathVariable("id") Integer id) {
		return repository.findById(id).toString();
	}

}
