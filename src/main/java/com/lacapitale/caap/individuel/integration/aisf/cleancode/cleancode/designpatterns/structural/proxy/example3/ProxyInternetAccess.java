package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example3;

/**
 * @author eugenia
 */
class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    private RealInternetAccess realAccess;

    ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }


    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    private int getRole(String emplName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        return 9;
    }
}
