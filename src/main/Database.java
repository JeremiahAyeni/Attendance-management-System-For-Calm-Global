/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;

/**
 *
 * @author JAT
 */
public class Database {

    Connection c = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public static void main(String[] args) {
        Database db = new Database();

    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db/attendanceLog.db");
           // c.setAutoCommit(false);

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

//    public void insertToTable(String sql) {
//        connect();
//
//        try {
//            ps = c.createStatement();
//
//            ps.executeUpdate(sql);
//            ps.close();
//            c.close();
//
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Inserted successfully");
//    }
//
//    public void updateInDatabse(String sql) {
//        connect();
//
//        try {
//            ps = c.createStatement();
//
//            ps.executeUpdate(sql);
//            c.commit();
//
//            ps.close();
//            c.close();
//
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Table User created successfully");
//    }
//
//    public void deleteFromDatabase(String sql) {
//        connect();
//
//        try {
//            ps = c.createStatement();
//
//            ps.executeUpdate(sql);
//            c.commit();
//
//            ps.close();
//            c.close();
//
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Table Atttendance created successfully");
//
//    }

        //SELECT FUNCTION NOT WORKING YET
//    public ResultSet selectFromDatabase(String sql) {
//        connect();
//        ResultSet rs = null;
//        try {
//
//            ps = c.createStatement();
//            rs = ps.executeQuery(sql);
//            
//            while (rs.next()) {
//                return rs;
//                
//            }
//            
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }finally{
//            rs.close();
//        }
//        return rs;
//        
//    }
    }
