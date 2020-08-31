package db.dbconsumer;

import db.dbutility.DbConnection;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

import static db.dbutility.DbConnection.resultSet;

public class CompareTwoDatabaseTable{

    /**
     * Create method to compare two database table.
     * As an example you can prepare two database and similar two tables with 20 records
     * Later get the records using Java and compare two
     * Later use unit testing framework to test in under test
     */
    static DbConnection dbConnection = new DbConnection();

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

       List<String> actor = new ArrayList<>();
        List<String> customer = new ArrayList<>();
        actor = dbConnection.readDatabase("actor", "first_name");
        customer = dbConnection.readDatabase("customer", "first_name");
        System.out.println(actor);
        System.out.println(customer);
    }

        }


