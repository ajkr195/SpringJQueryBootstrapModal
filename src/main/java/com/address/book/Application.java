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

		addBookRepo.save(new Addressbook(1l, "Fname1", "LName1", 1234512345l, "fname1.lname1@email.com",
				"fname1 lname1 some address"));
		addBookRepo.save(new Addressbook(2l, "Fname2", "LName2", 1234512345l, "fname2.lname2@email.com",
				"fname2.lname1 some address"));
		addBookRepo.save(new Addressbook(3l, "Fname3", "LName3", 1234512345l, "fname3.lname3@email.com",
				"fname3 lname3 some address"));
		addBookRepo.save(new Addressbook(4l, "Fname4", "LName4", 1234512345l, "fname4.lname4@email.com",
				"fname4.lname4 some address"));
		addBookRepo.save(new Addressbook(5l, "Fname5", "LName5", 1234512345l, "fname5.lname5@email.com",
				"fname5.lname5 some address"));
		addBookRepo.save(new Addressbook(6l, "Fname6", "LName6", 1234512345l, "fname6.lname6@email.com",
				"fname6.lname6 some address"));

	}

}
