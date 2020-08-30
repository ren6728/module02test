package db.dbutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbConnection {

    /**
     *
     * This is a helper class to interact with Database tables
     * You are free to enhance this class as needed
     *
     * */


   static Connection connect = null;
   static Statement statement = null;
   static ResultSet resultSet = null;
   static PreparedStatement ps = null;


   public static Properties loadProperties() throws IOException {

       InputStream inputStream = new FileInputStream("src/main/resources/secret.properties");

       Properties properties = new Properties();
       properties.load(inputStream);
       inputStream.close();
       return properties;
   }

    public static void connectPostgresql() throws ClassNotFoundException, SQLException, IOException {

      Properties properties = loadProperties();

        String url = properties.getProperty("db.url");
        String userName = properties.getProperty("db.userName");
        String passWord = properties.getProperty("db.password");

         connect = DriverManager.getConnection(url,userName,passWord);

        System.out.println("Database Connected");

    }
    /**
     * Read database
     *
     * */

    public static List<String> readDatabase(String actor, String first_name) throws SQLException, ClassNotFoundException, IOException {

        List<String> list = new ArrayList<>();

        connectPostgresql();
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from "+ actor);
        list = getResultSetData(first_name);
        return list;
    }

    public static List<String> getResultSetData(String first_name) throws SQLException {

        List<String> dataList = new ArrayList<>();

        while (resultSet.next()){
            String cell1 = resultSet.getString(first_name);
            dataList.add(cell1);
        }
        return dataList;

    }

    public static List<String> readDatabase(String customer, String first_name,String last_name, String email) throws SQLException, ClassNotFoundException, IOException {

        List<String> list = new ArrayList<>();

        connectPostgresql();
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from "+ customer);
        list = getResultSetData(first_name,last_name,email);
        return list;
    }

    public static List<String> getResultSetData(String first_name,String last_name, String email ) throws SQLException {

        List<String> dataList = new ArrayList<>();

        while (resultSet.next()){

            String cell1 = resultSet.getString(first_name);
            String cell2 = resultSet.getString(last_name);
            String cell3 = resultSet.getString(email);

            dataList.add(cell1); dataList.add(cell2); dataList.add(cell3);

        }

        return dataList;

    }

    /**
     *
     * Create Table
     *
     * */

    public static void createTableFromStringToPostgresql(String actorandcustomer, String newname){
        try {
            connectPostgresql();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `"+actorandcustomer+"`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `"+actorandcustomer+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`"+newname+"` varchar(2500) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * Insert data to a existing table
     *
     * */
    public static void insertDataFromArrayListToPostgresql(List<String> list,String actorandcustomer, String newname)
    {
        try {
            connectPostgresql();

            for(String st:list){
                ps = connect.prepareStatement("INSERT INTO "+actorandcustomer+" ( "+newname+" ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}

