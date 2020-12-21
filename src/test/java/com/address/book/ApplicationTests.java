package com.address.book;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Application.class)
@TestPropertySource(value = { "classpath:application.properties" })
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
class ApplicationTests {
	

	@Test
	void contextLoads() {
	}

	@Test
	public void testContactList() {

		get("http://localhost:8080/api/getallcontacts").then().assertThat().statusCode(200).body("size()", is(6));

		get("http://localhost:8080/api/contact/1")
				.then()
				.assertThat()
				.statusCode(200)
				.body("firstname", Matchers.equalTo("Fname1"));

		get("http://localhost:8080/api/contact/6")
				.then()
				.assertThat()
				.statusCode(200)
				.body("lastname", Matchers.equalTo("LName6"));

	}

}
