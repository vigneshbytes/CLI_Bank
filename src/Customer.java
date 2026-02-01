import java.util.HashMap;
import java.util.Scanner;

public class Customer extends People{
    Customer(Integer id, String name, int age, boolean activeStatus, String password){
        super(name, age, activeStatus, password);
        customerID = id;
    }

    Customer(Integer id, String name, int age){
        super(name, age);
        customerID = id;
    }

    Customer(Integer id){
        super();
        customerID = id;
    }

    // members of Customer
    final Integer customerID;

    Integer deposit(){
        System.out.println("Please enter your Deposit MAX 10k: ");
        Scanner sc = new Scanner(System.in);
        int addMon = 0;
        boolean validFlag = false;

        while(!validFlag) {
            try {
                addMon = Validator.depositCheck(sc.nextInt());
                validFlag = true;
            } catch (Exception e) {
                System.out.print("issue: " + e.getMessage());
                System.out.println(";  so please try again");
                System.out.println("Please enter your Deposit MAX 10k: ");
                sc.nextLine();
            }
        }

        return addMon;
    }

    // static class to store data
    public static class CustomerData {
        static HashMap<Integer,Customer> customerDB = new HashMap<>();

        public static Customer createNewCustomer(){
            Integer customerID = (customerDB.size() + 101);
            Customer c = new Customer(customerID);
            customerDB.put(customerID, c);

            return c;
        }


    }
}
