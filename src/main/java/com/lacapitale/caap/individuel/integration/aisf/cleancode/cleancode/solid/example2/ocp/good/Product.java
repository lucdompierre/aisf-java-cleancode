package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.ocp.good;

public abstract class Product {
	
	
	private double basePrice;
	
	public abstract double calculateTaxIncludedPrice();

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
