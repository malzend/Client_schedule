package helper;

import model.Customer;
import model.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerQuery {


    public static void customerData() throws SQLException {
        String customerData = "SELECT * FROM customers ";
        PreparedStatement sl = JDBC.connection.prepareStatement(customerData);
        ResultSet rl = sl.executeQuery();
        while(rl.next()){

          int customerID = rl.getInt("Customer_ID");
          String customerName = rl.getString("Customer_Name");
          String address = rl.getString("Address");
          String postalCode = rl.getString("Postal_Code");
          String phoneNumber = rl.getString("Phone");

            Model.addCustomer(new Customer(customerID,customerName,address,postalCode,phoneNumber));


        }
    }

        public static int customerID() throws SQLException {

         int customerID = 0;
            String customerData = "SELECT * FROM customers WHERE Customer_ID =(SELECT MAX(Customer_ID) FROM customers); ";
            PreparedStatement sl = JDBC.connection.prepareStatement(customerData);
            ResultSet rl = sl.executeQuery();
            while(rl.next()){
            customerID = rl.getInt("Customer_ID");

            }

            return customerID;
    }
     public static String customerAdd(int customerID, String customerName, String address, String  postalCode, String phone) throws SQLException{
        String goodInsert= "Success";
        String badInsert= "Not successful ";
            String customerAdd= "INSERT INTO customers (Customer_ID, Customer_Name,Address, Postal_Code, Phone, Division_ID) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = JDBC.connection.prepareStatement(customerAdd);
            ps.setInt(1,customerID );
            ps.setString(2,customerName);
            ps.setString(3, address);
            ps.setString(4, postalCode);
            ps.setString(5,phone);
            ps.setInt(6,1);
            int insertResult = ps.executeUpdate();
            if(insertResult > 0){
                return goodInsert;
            }
            else {
                return badInsert;
            }


        }

     public static String customerDelete(int customerID) throws  SQLException{
         String goodDelete= "Success";
         String badDelete= "Not successful";

             String customerDelete= "DELETE FROM customers WHERE Customer_ID = ?";
             PreparedStatement ps = JDBC.connection.prepareStatement(customerDelete);
             ps.setInt(1, customerID);
             int deleteResult= ps.executeUpdate();

             if(deleteResult > 0){
               return goodDelete;
               }
                   else {
               return badDelete;
         }
         }


     }



