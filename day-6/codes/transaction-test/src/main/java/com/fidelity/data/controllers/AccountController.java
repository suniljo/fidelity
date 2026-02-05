package com.fidelity.data.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.data.dtos.TransferRequest;
import com.fidelity.data.services.AccountService;

@RestController
@RequestMapping("/api/bank")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@PostMapping
	public String doTransfer(@RequestBody TransferRequest transReq) {
		accountService.transferFunds(transReq.getFromAccount(), transReq.getToAccount(), transReq.getAmount());
		return "Done";
	}
}
