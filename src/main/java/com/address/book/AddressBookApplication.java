package com.address.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.address.book.model.Addressbook;
import com.address.book.repository.AddressbookRepository;

@SpringBootApplication
public class AddressBookApplication implements CommandLineRunner {

	@Autowired
	AddressbookRepository addBookRepo;

	public static void main(String[] args) {
		SpringApplication.run(AddressBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		addBookRepo.save(new Addressbook(1, "Fname1", "LName1", 12345, "fname1.lname1@email.com"));
//		addBookRepo.save(new Addressbook(2, "Fname2", "LName2", 12345, "fname2.lname2@email.com"));
//		addBookRepo.save(new Addressbook(3, "Fname3", "LName3", 12345, "fname3.lname3@email.com"));
//		addBookRepo.save(new Addressbook(4, "Fname4", "LName4", 12345, "fname4.lname4@email.com"));
//		addBookRepo.save(new Addressbook(5, "Fname5", "LName5", 12345, "fname5.lname5@email.com"));
//		addBookRepo.save(new Addressbook(6, "Fname6", "LName6", 12345, "fname6.lname6@email.com"));
//		addBookRepo.save(new Addressbook(7, "Fname7", "LName7", 12345, "fname7.lname7@email.com"));
//		addBookRepo.save(new Addressbook(8, "Fname8", "LName8", 12345, "fname8.lname8@email.com"));
//		addBookRepo.save(new Addressbook(9, "Fname9", "LName9", 12345, "fname9.lname9@email.com"));
//		addBookRepo.save(new Addressbook(10, "Fname10", "LName10", 12345, "fname10.lname10@email.com"));
//		addBookRepo.save(new Addressbook(11, "Fname11", "LName11", 12345, "fname11.lname1@email.com"));
//		addBookRepo.save(new Addressbook(12, "Fname12", "LName12", 12345, "fname12.lname12@email.com"));
//		addBookRepo.save(new Addressbook(13, "Fname13", "LName13", 12345, "fname13.lname13@email.com"));
//		addBookRepo.save(new Addressbook(14, "Fname14", "LName14", 12345, "fname14.lname14@email.com"));
//		addBookRepo.save(new Addressbook(15, "Fname15", "LName15", 12345, "fname15.lname15@email.com"));
//		addBookRepo.save(new Addressbook(16, "Fname16", "LName16", 12345, "fname16.lname16@email.com"));
//		addBookRepo.save(new Addressbook(17, "Fname17", "LName17", 12345, "fname17.lname17@email.com"));
//		addBookRepo.save(new Addressbook(18, "Fname18", "LName18", 12345, "fname18.lname18@email.com"));
//		addBookRepo.save(new Addressbook(19, "Fname19", "LName19", 12345, "fname19.lname19@email.com"));
//		addBookRepo.save(new Addressbook(20, "Fname20", "LName20", 12345, "fname20.lname20@email.com"));

		addBookRepo.save(new Addressbook("Fname1", "LName1", 12345, "fname1.lname1@email.com"));
		addBookRepo.save(new Addressbook("Fname2", "LName2", 12345, "fname2.lname2@email.com"));
		addBookRepo.save(new Addressbook("Fname3", "LName3", 12345, "fname3.lname3@email.com"));
		addBookRepo.save(new Addressbook("Fname4", "LName4", 12345, "fname4.lname4@email.com"));
		addBookRepo.save(new Addressbook("Fname5", "LName5", 12345, "fname5.lname5@email.com"));
		addBookRepo.save(new Addressbook("Fname6", "LName6", 12345, "fname6.lname6@email.com"));
		addBookRepo.save(new Addressbook("Fname7", "LName7", 12345, "fname7.lname7@email.com"));
		addBookRepo.save(new Addressbook("Fname8", "LName8", 12345, "fname8.lname8@email.com"));
		addBookRepo.save(new Addressbook("Fname9", "LName9", 12345, "fname9.lname9@email.com"));
		addBookRepo.save(new Addressbook("Fname10", "LName10", 12345, "fname10.lname10@email.com"));
		addBookRepo.save(new Addressbook("Fname11", "LName11", 12345, "fname11.lname1@email.com"));
		addBookRepo.save(new Addressbook("Fname12", "LName12", 12345, "fname12.lname12@email.com"));
		addBookRepo.save(new Addressbook("Fname13", "LName13", 12345, "fname13.lname13@email.com"));
		addBookRepo.save(new Addressbook("Fname14", "LName14", 12345, "fname14.lname14@email.com"));
		addBookRepo.save(new Addressbook("Fname15", "LName15", 12345, "fname15.lname15@email.com"));
		addBookRepo.save(new Addressbook("Fname16", "LName16", 12345, "fname16.lname16@email.com"));
		addBookRepo.save(new Addressbook("Fname17", "LName17", 12345, "fname17.lname17@email.com"));
		addBookRepo.save(new Addressbook("Fname18", "LName18", 12345, "fname18.lname18@email.com"));
		addBookRepo.save(new Addressbook("Fname19", "LName19", 12345, "fname19.lname19@email.com"));
		addBookRepo.save(new Addressbook("Fname20", "LName20", 12345, "fname20.lname20@email.com"));

	}

}
