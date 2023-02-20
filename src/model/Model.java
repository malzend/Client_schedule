package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class Model {

    private static final ObservableList<User> User = FXCollections.observableArrayList();
    private static final ObservableList<User> Country = FXCollections.observableArrayList();
    private static final ObservableList<User> Appointment  = FXCollections.observableArrayList();
    private static final  ObservableList<User> FirstLevelDivision = FXCollections.observableArrayList();
    private static final ObservableList<User> Contact = FXCollections.observableArrayList();
    private static final ObservableList<Customer> CUSTOMERS= FXCollections.observableArrayList();

    public static ObservableList<Customer> getCustomer() {
        return CUSTOMERS;
    }

    public static void addCustomer(Customer newCustomer){
       CUSTOMERS.add(newCustomer);
    }


    public static void removeCustomer(Customer customer){
        CUSTOMERS.remove(customer);
    }

    public static void removeALLCustomer(){
       CUSTOMERS.clear(); }

    public static int incrementID() throws SQLException {
        Customer customer = new Customer();
        return  customer.getCustomerID() + 1 ;

    }
    public static void modifyCustomer(int ID ,Customer selectedCustomer){

        /*for(int i = 0; i < allProducts.size(); i++){
            if(allProducts.get(i).getId() == id){
                allProducts.get(i).setName(selectedProduct.getName());
                allProducts.get(i).setPrice(selectedProduct.getPrice());
                allProducts.get(i).setStock(selectedProduct.getStock());
                allProducts.get(i).setMin(selectedProduct.getMin());
                allProducts.get(i).setMax(selectedProduct.getMax());
            }*/
        }

}
