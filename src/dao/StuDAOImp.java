package dao;

import java.sql.*;
import java.util.*;

public class StuDAOImp implements StuDAO {
  String url = "jdbc:hsqldb:hsql://localhost";
  String driver = "org.hsqldb.jdbcDriver";
  String user = "sa";
  String pass_db = "";
  @Override public boolean check(String username, String pass) throws Exception {
    boolean isSuc=false;
    String sql = "select * from stu where username=? and pass=?";
    Class.forName(driver);    
    try (Connection con = DriverManager.getConnection(url, user, pass_db);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setString(1, username);
      pstmt.setString(2, pass);
      try (ResultSet rs = pstmt.executeQuery();) {
        isSuc = rs.next();
      }
    }  
    return isSuc;
  }
  @Override public List<String[]> getAllStus() throws Exception{
    List<String[]> stus=new ArrayList<String[]>();
    String sql="select * from stu";
    Class.forName(driver);
    try (Connection con = DriverManager.getConnection(url, user, pass_db);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      try(ResultSet rs=pstmt.executeQuery()){
        while(rs.next()){
          String[] row=new String[5];
          row[0]=rs.getString("id");
          row[1]=rs.getString("username");
          row[2]=rs.getString("os");
          row[3]=rs.getString("java");
          row[4]=rs.getString("math");
          stus.add(row);
        }
      }
    }
    return stus;
  }
}
