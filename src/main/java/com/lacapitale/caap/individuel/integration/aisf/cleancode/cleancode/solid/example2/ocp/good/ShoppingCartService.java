package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.ocp.good;

import java.util.List;

public class ShoppingCartService {
	
	public double calculateTotalOrder(List<Product> products){

		
		double orderTotal = 0;
		
		
		for (Product product : products) {


			orderTotal+=product.calculateTaxIncludedPrice();
		}
		return orderTotal;
	}
}
