package com.fidelity.data.entities;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTACT_MASTER")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // database - auto-increment in MySQL
	private Integer contactId;
	private String contactName;
	private String contactNumber;

	public Contact(String contactName, String contactNumber) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return String.format("Contact [%-5d  %-25s  %-10s]", contactId, contactName, contactNumber);
	}
}
