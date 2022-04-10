package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example1;

import java.sql.Connection;

/**
 * @author eugenia
 */
class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        System.out.println("get MySql DB connection using connection parameters");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }
}
