package it.palm.connection;

import java.sql.*;

  public class Database {
     private static String SQLPath = "D:\\Users\\Emanuele Palmieri\\Desktop\\learnGRPC\\GRPCServer\\db\\";
     private static Connection conn = null;


    public static void connect(String fileName) {
        try {
            // db parameters
            String url = "jdbc:sqlite:" + SQLPath + fileName;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

      public static Connection getConn() {
          return conn;
      }

      public static void close()  {
          try {
              if (conn != null) {
                  conn.close();
              }
          } catch (SQLException e){
              System.out.println(e.getMessage());
          }
      }
  }
