package com.address.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.address.book.model.Addressbook;

public interface AddressbookRepository extends JpaRepository<Addressbook, Long> {

}
