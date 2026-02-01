import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // main code here
        Customer p1 = Customer.CustomerData.createNewCustomer();

        System.out.println("Name: "+ p1.name);
        System.out.println("Age: "+ p1.age);
        System.out.println("AccStatus: "+ p1.activeStatus);
        System.out.println("Pass: "+ p1.password);
        System.out.println("CustomerID: "+p1.customerID);

    }
}