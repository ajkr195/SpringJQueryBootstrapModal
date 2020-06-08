package com.address.book.controller;

public class AddressBookNotFoundException extends RuntimeException {

	public AddressBookNotFoundException(String exception) {
		super(exception);
	}

}