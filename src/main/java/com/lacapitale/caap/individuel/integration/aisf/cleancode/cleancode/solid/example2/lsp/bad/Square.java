package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.lsp.bad;

public class Square extends Rectangle{
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}

}
