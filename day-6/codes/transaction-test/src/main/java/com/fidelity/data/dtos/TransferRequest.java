package com.fidelity.data.dtos;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransferRequest {
	private Long fromAccount;
	private Long toAccount;
	private BigDecimal amount;
}
