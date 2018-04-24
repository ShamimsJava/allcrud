package com.shamim.bean;

public class User {

    private int id;
    private String fname, lname, username, password;

    public User() {
    }

    public User(int id, String fname, String lname, String username, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
    }

    public User(String fname, String lname, String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{"  + " fname=" + fname + ", lname=" + lname + ", username=" + username + ", password=" + password + '}';
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            User user = new User("shamim", "sarker", "shamim", "shamim");
            System.out.println(user);
        }
    }
}
