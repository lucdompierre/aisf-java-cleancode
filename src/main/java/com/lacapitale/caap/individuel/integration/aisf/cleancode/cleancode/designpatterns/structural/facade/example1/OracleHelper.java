package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example1;

import java.sql.Connection;

/**
 * @author eugenia
 */
class OracleHelper {

    public static Connection getOracleDBConnection() {
        System.out.println("get Oracle DB connection using connection parameters");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }
}
