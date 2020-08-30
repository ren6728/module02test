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

public class CompareTwoDatabaseTable {

    /**
     *
     * Create method to compare two database table.
     * As an example you can prepare two database and similar two tables with 20 records
     * Later get the records using Java and compare two
     * Later use unit testing framework to test in under test
     *
     * */
    static DbConnection dbConnection;

    static {
        dbConnection=new DbConnection();
    }
    public static void main(String[] args) throws IOException, SQLException {
        //getActorInfo();
        //getAddress();
        getActorsFirstNameFromDB();
        getCustomersFirstNameFromDB();


    }
    public static void getActorInfo() throws IOException, SQLException {
        DbConnection dbConnection=new DbConnection();
        String query="SELECT actor_id, first_name, last_name, last_update FROM public.actor limit 20;";
        dbConnection.getResultSetData("first_name","last_name","actor_id");
    }
    public static void getCustomerInfo() throws IOException, SQLException {
        String query="SELECT customer_id, store_id, first_name, last_name, email, address_id, activebool, create_date, last_update FROM public.customer limit 20;";
        dbConnection.getResultSetData("first_name","last_name","email");
    }
    public static List getActorsFirstNameFromDB() throws IOException, SQLException {
        String query = "SELECT first_name FROM public.actor limit 20";
        Statement statement = null;
        ResultSet resultSet = statement.executeQuery(query);
        List<String> actorsFirstNameListFromDB = new ArrayList<>();

        while (resultSet.next()){
            actorsFirstNameListFromDB.add(resultSet.getString("first_name"));

        }

        actorsFirstNameListFromDB.forEach(str-> System.out.println(str));

        return actorsFirstNameListFromDB;
    }
    public static List getCustomersFirstNameFromDB() throws IOException, SQLException {
        String query = "SELECT first_name FROM public.customer limit 20";
        Statement statement = null;
        ResultSet resultSet = statement.executeQuery(query);
        List<String> customersFirstNameListFromDB = new ArrayList<>();

        while (resultSet.next()){
            customersFirstNameListFromDB.add(resultSet.getString("first_name"));
        }

        customersFirstNameListFromDB.forEach(str-> System.out.println(str));

        return customersFirstNameListFromDB;
    }


}
