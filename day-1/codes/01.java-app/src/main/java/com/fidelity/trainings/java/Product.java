package com.fidelity.trainings.java;

import java.util.Objects;

public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String productName, Float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(productPrice, other.productPrice);
	}




	
}
