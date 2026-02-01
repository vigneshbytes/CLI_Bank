import java.util.Scanner;

 public class People {
// public abstract class People {
    final String name;
    final int age;
    boolean activeStatus;
    String password;

    People(String name, int age, boolean activeStatus, String password){
        this.name = name;
        this.age = age;
        this.activeStatus = activeStatus;
        this.password = password;
    }
    People(String name, int age){
        this(name, age, true, "1234");
    }

    People(){
        this(getName(), getAge());
    }

    static final String getName(){
        System.out.println("Please enter your Name: ");
        String name = "";
        Scanner sc = new Scanner(System.in);
        boolean validFlag = false;

        while(!validFlag){
            try {
                name = Validator.nameCheck(sc.nextLine());
                validFlag = true;
            }
            catch(Exception e) {
                System.out.print("issue: "+e.getMessage());
                System.out.println(";  so please try again");
                System.out.println("Please enter your Name: ");
            }
        }
        return name;
    }

    static final int getAge() {
        System.out.println("Please enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean validFlag = false;

        while(!validFlag){
            try{
                age = Validator.ageCheck(sc.nextInt());
                validFlag = true;
            }
            catch (Exception e){
                System.out.print("issue: "+e.getMessage());
                System.out.println(";  so please try again");
                System.out.println("Please enter your Age: ");
                sc.nextLine();
            }
        }

        return age;
    }

    //abstract String getUserID();
}
