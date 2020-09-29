package com.taskplanner.model;

public class User {

    private String email;

    private String name;

    private String password;

    public User(){

    }

    public User(String email, String password,String name) {
        this.email = email;
        this.password = password;
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object ob){
        if(!(ob instanceof User)) return false;
        User u = (User) ob;
        return u.getEmail().equals(this.email);
    }

    @Override
    public int hashCode(){
        return 45;
    }

}
