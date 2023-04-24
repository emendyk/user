package edu.guilford;

public class tester

{
    // attributes
    private String petName;
    private String favColor;
    private String birthday;
    private String password;

    // constructor
    public tester(String petName, String favColor, String birthday) {
        this.petName = petName;
        this.favColor = favColor;
        this.birthday = birthday;
        this.password = petName.substring(0,2) + favColor.substring(0,2) + birthday.substring(0,4);
  }
    // getters and setters
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getFavColor() {
        return favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // toString
    @Override

    public String toString() {
        return "tester{" +
                "petName='" + petName + '\'' +
                ", favColor='" + favColor + '\'' +
                ", birthday='" + birthday + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
    

