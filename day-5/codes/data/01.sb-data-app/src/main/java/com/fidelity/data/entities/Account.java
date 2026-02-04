package com.fidelity.data.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fidelity.data.dtos.AccountStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACCOUNTS_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Account {
	@Id
	@Column(name = "ACC_ID")
	private Long id;
	
	@Column(name = "HOLDER_NAME")
	private String holderName;
	
	private Float balance;
	
	@Column(name = "STATUS")
	private AccountStatus status;
	
	@LastModifiedDate
	private LocalDateTime lastUpdated;

	public Account(Long id, String holderName, Float balance, AccountStatus status) {
		super();
		this.id = id;
		this.holderName = holderName;
		this.balance = balance;
		this.status = status;
	}
	
	
}
