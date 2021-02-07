package com.maniraj.pawnbroking.PawnBrokingApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PawnBrokingApp {

	private static final Logger log = LoggerFactory.getLogger(PawnBrokingApp.class);
	public static void main(String[] args) {
		SpringApplication.run(PawnBrokingApp.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ClientRepository repository) {
		return args -> {

			// save a few customers
//			repository.save(new Table1("Jack", "Bauer"));
//			repository.save(new Table1("Chloe", "O'Brian"));
//			repository.save(new Table1("Kim", "Bauer"));
//			repository.save(new Table1("David", "Palmer"));
//			repository.save(new Table1("Michelle", "Dessler"));

			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Clients customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");

			// fetch an individual customer by ID
//			Clients customer = repository.findById(1L);
//			log.info("Customer found with findById(1L):");
//			log.info("--------------------------------");
//			if(customer != null)
//			log.info(customer.toString());
//			log.info("");

			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
//			log.info("");

		};
	}

	@Bean
	public ClientService table1Service()
	{
		return new ClientService();
	}

}
