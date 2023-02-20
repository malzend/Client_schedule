package model;

public class User {


    private String userName;
    private String passWord;
    private int userID = 100;

    public User(String userName, String passWord, int userID) {
        this.userName = userName;
        this.passWord = passWord;
        this.userID = userID;

    }

    public String getuserID() {
        return userName;
    }

    public String getPssword() {
        return passWord;
    }

    public int getUserID() {
        return userID++;
    }

    public void setUserID(String uName) {
        this.userID  = userID;
    }

    public void setPassword(String password) {
        this.passWord = passWord;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

}