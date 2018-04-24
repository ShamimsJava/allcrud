package com.shamim.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.shamim.bean.User;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //###################Connection#######################
    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "root");
            System.out.println("Succesfully connected....");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    //###################Login validity#######################
    public static boolean validate(User user) {

        boolean status = false;
        String sql = "select * from user where username = ? and password = ?";

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    //###################Record List#######################
    public static List<User> getAllRecords() {

        List<User> list = new ArrayList<>();
        String sql = "select * from user";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("username"), rs.getString("password"));
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    //###################Get record by id#######################
    public static User getRecordById(int id) {

        User user = null;
        String sql = "select * from user where id = ?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("username"), rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    //###################save record#######################
    public static int save(User user) {

        int status = 0;
        String sql = "insert into user(fname, lname, username, password) values(?, ?, ?, ?)";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getFname());
            ps.setString(2, user.getLname());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPassword());
            status = ps.executeUpdate();
            System.out.println("Successfully saved...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    //###################update record#######################
    public static int update(User user){
        
        int status = 0;
        String sql = "update user set fname = ?, lname = ?, username = ?, password = ? where id = ?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getFname());
            ps.setString(2, user.getLname());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPassword());
            ps.setInt(5, user.getId());
            status = ps.executeUpdate();
            System.out.println("Successfully updated...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    //###################update record#######################
    public static int delete(int id){
        
        int status = 0;
        String sql = "delete from user where id = ?";
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();
            System.out.println("Successfully deleted...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    //###################Main method for testing#######################
    public static void main(String[] args) {
        //getConnection();
        
        //System.out.println(validate(new User(1, "admin", "admin", "admin", "admin")));
        
        /*
        List<User> user = getAllRecords();
        for (User user1 : user) {
            System.out.println(user1);
        }
         */
        
        //System.out.println(getRecordById(4));
        
        //save(new User("megha", "megha", "megha", "megha"));
        
        //update(new User(5, "megha2", "megha", "megha", "megha"));
        
        //delete(5);
    }
}
