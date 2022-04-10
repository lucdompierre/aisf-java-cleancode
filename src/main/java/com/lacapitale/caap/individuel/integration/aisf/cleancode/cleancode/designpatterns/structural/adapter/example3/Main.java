package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example3;

/**
 * This is the client class
 *
 * @author eugenia
 */
public class Main {

    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
