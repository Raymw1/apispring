package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping
	public ResponseEntity<List<Account>> list() {
		List<Account> accounts = new ArrayList<Account>();
		accountRepository.findAll().forEach(accounts::add);
		return ResponseEntity.ok(accounts);
	}
}
