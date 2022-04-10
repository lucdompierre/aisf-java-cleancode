package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example1;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report using Facade
        DbHelperFacade.generateReport(DbHelperFacade.DBTypes.MYSQL, DbHelperFacade.ReportTypes.HTML, tableName);
        DbHelperFacade.generateReport(DbHelperFacade.DBTypes.ORACLE, DbHelperFacade.ReportTypes.PDF, tableName);
    }
}
