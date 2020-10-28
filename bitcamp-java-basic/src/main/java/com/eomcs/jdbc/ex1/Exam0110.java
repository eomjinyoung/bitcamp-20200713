package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver driver = new org.mariadb.jdbc.Driver();
      DriverManager.registerDriver(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mysql:");
      System.out.println(driver2);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
