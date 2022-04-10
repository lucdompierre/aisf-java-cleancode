package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.srp.good;

public class Book implements Printable{
	private String author;
	private String text;
	private String name;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getContent() {
		return text;
	}
	
}
