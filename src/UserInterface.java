import java.util.Scanner;

public class UserInterface {

    //==========================
    // methods that handles user interaction
    //==========================
    void enteredUserConsole (){

        Customer cust = Customer.CustomerData.customerLogin();

        assert cust != null;
        System.out.println("Welcome "+cust.name);
        boolean exitFlag = false;

        while(!exitFlag){
            UserOptions userChoice = UserOptions.pickChoice();

            switch(userChoice){
                case ZERO -> exitFlag = true;
                case ONE -> printAccSummary(cust);
                case TWO -> depositMoney(cust);
                case THREE -> withdrawMoney(cust);
                case FOUR -> lastFiveTransactions(cust);
                default -> exitFlag = true;
            }
            System.out.println("======================================================");
        }

    }



    //==========================
    // methods that handle user functions
    //==========================
    void printAccSummary(Customer cust){
        System.out.println("======================================================");
        System.out.println("Name: "+ cust.name);
        System.out.println("Age: "+ cust.age);
        System.out.println("AccStatus: "+ cust.activeStatus);
        System.out.println("Pass: "+ cust.password);
        System.out.println("CustomerID: "+cust.customerID);
        System.out.println("======================================================");
    }

    void depositMoney(Customer cust){
        System.out.println("example deposit success");
        System.out.println("======================================================");
    }

    void withdrawMoney(Customer cust){
        System.out.println("example withdraw success");
        System.out.println("======================================================");
    }

    void lastFiveTransactions(Customer cust){
        System.out.println("example last 5 transactions success");
        System.out.println("======================================================");
    }
}


// ====================================
// Enums to handle user inputs
//=====================================
enum UserOptions {
    ZERO(0, "Go Back"),
    ONE(1, "View Account Summary"),
    TWO(2, "Deposit money"),
    THREE(3, "Withdraw money"),
    FOUR(4, "See last 5 transactions");

    final Integer choiceID;
    final String choiceType;

    UserOptions(Integer choiceID, String choiceType){
        this.choiceID = choiceID;
        this.choiceType = choiceType;
    }

    UserOptions(UserOptions obj){
        this.choiceID = obj.choiceID;
        this.choiceType = obj.choiceType;
    }

    static UserOptions returnObjByID(Integer i){
        switch (i){
            case 0: return ZERO;
            case 1: return ONE;
            case 2: return TWO;
            case 3: return THREE;
            case 4: return FOUR;
        }
        return ZERO;
    }

    static void printChoice(UserOptions e){
        System.out.println(e.choiceID+" for :"+e.choiceType);
    }

    static UserOptions pickChoice(){
        Scanner sc = new Scanner(System.in);
        boolean validFlag = false;
        int choice = 0;

        while (!validFlag){
            System.out.println("======================================================");
            try{
                System.out.println("please enter one of the following choices");
                for(UserOptions e: UserOptions.values()){
                    printChoice(e);
                }
                choice = Validator.choiceCheck(sc.nextInt());
                validFlag = true;
            }
            catch (Exception e){
                System.out.print("issue: "+e.getMessage());
                System.out.println(";  so please try again");
                sc.nextLine();
            }
            finally{
                System.out.println("======================================================");
            }
        }
        return returnObjByID(choice);
    }
}