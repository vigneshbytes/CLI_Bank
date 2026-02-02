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

        public static Customer customerLogin(){

            // Method to validate existence of customer
            if (customerDB.size() == 0){
                System.out.println("You are the first customer. lets create you an account");
                Customer c = createNewCustomer();
                System.out.println("Your ID is "+c.customerID);
                return c;
            }


            boolean validFlag = false;
            Scanner sc = new Scanner(System.in);
            Integer customerID = 0;

            while(!validFlag){
                System.out.println("Enter the CustomerID (101 to 999)");
                if (sc.hasNextInt()){
                    customerID = sc.nextInt();
                }
                else {
                    System.out.println("Invalid input, please try again");
                    sc.nextLine();
                }
                if (customerID < 101 | customerID >999){
                    System.out.println("CustomerID out of range, please try again");
                    sc.nextLine();
                    continue;
                }
                if (customerDB.containsKey(customerID)){
                    validFlag = true;
                    return customerDB.get(customerID);
                }
                else {
                    System.out.println("CustomerID does not exist, please try again");
                    sc.nextLine();
                    continue;
                }
            }
            return null;
        }
    }
}
