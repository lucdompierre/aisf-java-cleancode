package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.lsp.bad;

public class Rectangle {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area(){
		return width*height;
	}

}
