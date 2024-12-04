package com.firstproject;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws  Exception{

        /*
        import package
        load and register
        create connection
        create statement
        execute the statement
        process the result
        close
         */

//      connection parameters
        String url = "jdbc:postgresql://localhost:5432/Eg_Db";
//      String url = "jdbc:engine://host:port/databasename";
        String user= "Asif_Raza";
        String password="Mohammed@123";

//      make connection to db
        Connection con= null;
        try{
        con= DriverManager.getConnection(url, user, password);
        }
        catch (Exception e){
            System.out.println("unable to connect DB");
        }

//        querry
        String querry = "select * from crud_app_crudobj";

//        execute the querry
        Statement st= null;
        try {
            st= con.createStatement();
        }
        catch (Exception e){
            System.out.println("unable to execute the statement");
        }

//        we are getting data in resultset
        ResultSet rs= null;
        try{
         rs= st.executeQuery(querry);
        }
        catch (Exception e){
            System.out.println("unable to execute the statement");
        }

//        Print data is exists or not
//        System.out.println(rs.next());

//        to get data
        rs.next();
        System.out.println(rs.getString("name"));

//        close the connection
        try {
            con.close();
        }
        catch(Exception e){
            System.out.println("unable to close the connection");
        }
    }
}