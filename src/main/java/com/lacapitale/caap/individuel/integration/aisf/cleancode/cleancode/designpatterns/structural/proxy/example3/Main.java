package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example3;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Robert Harrison");
        access.grantInternetAccess();
    }
}
