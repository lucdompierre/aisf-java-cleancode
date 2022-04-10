package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example3;

/**
 * Class for granting internet access permission to the specific employee
 *
 * @author eugenia
 */
class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    RealInternetAccess(String empName) {
        this.employeeName = empName;
    }

    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
}
