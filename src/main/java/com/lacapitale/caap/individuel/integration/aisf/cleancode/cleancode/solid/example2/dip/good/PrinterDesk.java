package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example2.dip.good;

public class PrinterDesk {
	private Printer printer;

	public PrinterDesk(Printer printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
