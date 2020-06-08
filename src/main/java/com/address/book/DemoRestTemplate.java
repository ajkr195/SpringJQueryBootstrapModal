package com.address.book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.address.book.model.Addressbook;

public class DemoRestTemplate {

	public static void main(String[] args) {
		
		getAddressbookContacts();

		//getAddressbookContactById(1l);

		//createAddressbookContact(12l, "Test12", "Test12", 123455l, "Test12", "Test12");

		//updateAddressbookContact(1l, 12l, "Test12", "Test12", 123455l, "Test12", "Test12");

		//deleteAddressbookContact(3l);

		//getAddressbookContacts();
	}

	private static void getAddressbookContacts() {
		final String uri = "http://localhost:8080/api/getallcontacts";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

		System.out.println(result);
	}

	private static void getAddressbookContactById(Long id) {
		final String uri = "http://localhost:8080/api/contact/" + id;

		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "1");

		RestTemplate restTemplate = new RestTemplate();
		Addressbook result = restTemplate.getForObject(uri, Addressbook.class, params);

		System.out.println(result);
	}

	private static void createAddressbookContact(Long id, String firstname, String lastname, Long phonenumber,
			String email, String address) {
		final String uri = "http://localhost:8080/api/contact";

		Addressbook newAddressbookContact = new Addressbook(id, firstname, lastname, phonenumber, email, address);

		RestTemplate restTemplate = new RestTemplate();
		Addressbook result = restTemplate.postForObject(uri, newAddressbookContact, Addressbook.class);

		System.out.println(result);
	}

	private static void updateAddressbookContact(Long id, Long newid, String firstname, String lastname,
			Long phonenumber, String email, String address) {
		final String uri = "http://localhost:8080/api/contact/" + id;

		Map<String, Long> params = new HashMap<String, Long>();
		params.put("id", id);

		Addressbook updatedAddressbookContact = new Addressbook(newid, firstname, lastname, phonenumber, email,
				address);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(uri, updatedAddressbookContact, params);
	}

	private static void deleteAddressbookContact(Long id) {
		final String uri = "http://localhost:8080/api/contact/" + id;

		Map<String, Long> params = new HashMap<String, Long>();
		params.put("id", id);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri, params);
	}

}
