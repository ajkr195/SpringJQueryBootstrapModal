package com.address.book.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.address.book.model.Addressbook;
import com.address.book.repository.AddressbookRepository;

@Controller
public class AddressController {

	@Autowired
	AddressbookRepository addBookRepo;
	
	@GetMapping("/")
	public String showList(Model model, @RequestParam (defaultValue="0") int page) {
		model.addAttribute("data", addBookRepo.findAll( PageRequest.of(page, 5, Sort.by(
			    Order.asc("id")))));
		model.addAttribute("currentPage", page);
		return "index";
	}
	
	@GetMapping("/list")
	public String showTheList(Model model, @RequestParam (defaultValue="0") int page) {
		model.addAttribute("data", addBookRepo.findAll( PageRequest.of(page, 5, Sort.by(
			    Order.asc("id")))));
		model.addAttribute("currentPage", page);
		return "index2";
	}
	
	@PostMapping("/save") 
	public String saveAddBook (Addressbook ab) {
		addBookRepo.save(ab);
		return "redirect:/";
	}
	
	@PostMapping("/save2") 
	public String saveAddBook2 (Addressbook ab) {
		addBookRepo.save(ab);
		return "redirect:/list";
	}
	
	
	@GetMapping("/delete") 
	public String deleteAddBook (Long id) {
		addBookRepo.deleteById(id);
		return "redirect:/";
	}
	
	@GetMapping("/findOne") 
	@ResponseBody
	public Optional<Addressbook> findOne (Long id) {
		return addBookRepo.findById(id);
	}
	
}
