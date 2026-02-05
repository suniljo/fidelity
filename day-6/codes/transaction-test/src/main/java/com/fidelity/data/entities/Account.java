package com.fidelity.data.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
}
