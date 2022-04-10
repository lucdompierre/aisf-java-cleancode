package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Adapter class
 *
 * @author eugenia
 */
public class BankCustomer implements CreditCard {

    private BankDetails bankDetails;

    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customerName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accNo = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankName = br.readLine();

            bankDetails = new BankDetails();
            bankDetails.setAccHolderName(customerName);
            bankDetails.setAccNumber(accNo);
            bankDetails.setBankName(bankName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreditCard() {
        long accno = bankDetails.getAccNumber();
        String accholdername = bankDetails.getAccHolderName();
        String bname = bankDetails.getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in "
                + bname + "bank is valid and authenticated for issuing the credit card.");
    }
}
