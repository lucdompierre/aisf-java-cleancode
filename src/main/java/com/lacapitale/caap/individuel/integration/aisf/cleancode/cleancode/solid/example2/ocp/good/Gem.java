package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.ocp.good;

public class Gem extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice();
	}

}
