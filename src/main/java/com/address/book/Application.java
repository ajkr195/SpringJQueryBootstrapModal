package com.address.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.address.book.model.Addressbook;
import com.address.book.repository.AddressbookRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	AddressbookRepository addBookRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		addBookRepo.save(new Addressbook(1l, "Fname1", "LName1", 1234512345l, "flname1@email.com",
				"address1"));
		addBookRepo.save(new Addressbook(2l, "Fname2", "LName2", 1234512345l, "flname2@email.com",
				"address2"));
		addBookRepo.save(new Addressbook(3l, "Fname3", "LName3", 1234512345l, "flname3@email.com",
				"address3"));
		addBookRepo.save(new Addressbook(4l, "Fname4", "LName4", 1234512345l, "flname4@email.com",
				"address4"));
		addBookRepo.save(new Addressbook(5l, "Fname5", "LName5", 1234512345l, "flname5@email.com",
				"address5"));
		addBookRepo.save(new Addressbook(6l, "Fname6", "LName6", 1234512345l, "flname6@email.com",
				"address6"));

	}

}
