import java.util.Scanner;

public class Utils {

    protected static void showMenu() {
        System.out.println("Please select a number based on your option:");
        System.out.println("0) Exit");
        System.out.println("1) Add a new customer");
    }

    protected static int getOption() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return(Integer.valueOf(input));
    }

    protected static int processOption(int option){
        switch(option){
            case 0:
                return -1;
            case 1:
                System.out.println("Adding new customer...");
                System.out.println(ProcessTask.addNewCustomer());
                //TODO process adding customer
                break;
            default:
                System.out.println("Please enter a valid option...");
                break;
        }
        return 0;
    }

    protected static void endGreeting() {
        System.out.println("Thank you for using our software today!");
        System.out.println("Copyright: Ghusharib Chohan");
        System.out.println("Computer Science Undergraduate at Imperial College London");
    }
}
