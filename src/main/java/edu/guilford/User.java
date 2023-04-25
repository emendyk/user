package edu.guilford;


import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class User 
{
    //attributes
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String petName;
    private String favColor;
    private String birthday;
    private String password;

    //constructor
    public User() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.petName = petName;
        this.favColor = favColor;
        this.birthday = birthday;
        this.password = password;
    }
    public String generatePassword() {
        String password = this.petName.substring(0, 2) + this.favColor.substring(0, 2) + this.birthday.substring(0, 4); // creates a password based on the user responses
        return password;
    }
    //getters and setters
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPetName() {
        return this.petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getFavColor() {
        return this.favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getBirthday() {
        return this.birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    }



