package edu.guilford;

import java.util.Scanner;

public class tester {
    Scanner input = new Scanner(System.in);
    int digit = input.nextInt();
    //attributes that identify the user
    String firstName = "qwertyuiopasdfghjklzxcvbnm";
    String lastName = "qwertyuiopasdfghjklzxcvbnm";
    String email = "qwertyuiopasdfghjklzxcvbnm@ qwertyuiopasdfghjklzxcvbnm. qwertyuiopasdfghjklzxcvbnm";
    String favoritePet = "qwertyuiopasdfghjklzxcvbnm";
    String favoriteColor = "qwertyuiopasdfghjklzxcvbnm";
    String favoirteNumber = "1234567890";

    String password = "";
    //constructor
    public tester() {
        // TODO Auto-generated constructor stub
    }
    // getters and setters for the attributes
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFavoritePet() {
        return favoritePet;
    }
    public void setFavoritePet(String favoritePet) {
        this.favoritePet = favoritePet;
    }
    public String getFavoriteColor() {
        return favoriteColor;
    }
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
    public String getFavoirteNumber() {
        return favoirteNumber;
    }
    public void setFavoirteNumber(String favoirteNumber) {
        this.favoirteNumber = favoirteNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //method to generate a password
    public void generatePassword() {
        for(int i = 0; i < digit; i++)
        {
            int rand = (int)(Math.random() * 6);
            
            switch(rand)  {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(firstName.length() * Math.random());
                    password += String.valueOf(firstName.charAt(rand));
                    break;
                case 2:
                    rand = (int)(lastName.length() * Math.random());
                    password += String.valueOf(lastName.charAt(rand));
                    break;
                case 3:
                    rand = (int)(email.length() * Math.random());
                    password += String.valueOf(email.charAt(rand));
                    break;
                case 4:
                    rand = (int)(favoritePet.length() * Math.random());
                    password += String.valueOf(favoritePet.charAt(rand));
                    break;
                case 5:
                    rand = (int)(favoriteColor.length() * Math.random());
                    password += String.valueOf(favoriteColor.charAt(rand));
                    break;
                case 6:
                    rand = (int)(favoirteNumber.length() * Math.random());
                    password += String.valueOf(favoirteNumber.charAt(rand));
                    break;
            }
        
    }
    System.out.println(password);
    }
    //main method
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        tester test = new tester();
        test.generatePassword();
    }
    
    
}
