package model;

public class Contact {

    private int ContactID = 100;
    private String contactName;
    private String email;


    Contact(int contactID, String contactName , String email ){
        this.ContactID = contactID;
        this.contactName = contactName;
        this.email = email;

    }

   public int getContactID(){
        return ContactID;

   }

    public String getContactName(){
        return contactName;
    }
    public String getEmail(){
        return email;

    }
    public void setContactID(int contactID ){
        this.ContactID = contactID;
    }
    public void setContactName(String contactName){
        this.contactName = contactName;
    }
    public void setEmail(String email){
        this.email = email;

    }
}
