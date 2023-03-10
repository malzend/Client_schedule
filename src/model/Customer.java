package model;

import helper.CustomerQuery;

import java.sql.SQLException;

public class Customer {


    private int customerID = CustomerQuery.customerID();
    private String customerName;
    private String address;
    private String postalCode;
    private String phoneNumber;

    public  Customer( int customerID, String customerName, String address, String postalCode , String phoneNumber) throws SQLException {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public Customer() throws SQLException {

    }

    public int  getCustomerID(){
        return customerID;

    }
    public String getCustomerName(){
        return customerName;
    }
    public String getAddress(){
        return address;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setAddress(String address){
        this.address = address;
    }
        public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
