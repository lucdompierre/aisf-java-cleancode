package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.ocp.good;

public class Food extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.08;
	}

}
