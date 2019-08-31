import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomerHandling {

    public static void main(String[] args) {
        /*  TODO Show Menu and choose options using Menu
            1) Add a new customer
            2) Add an order
                - OrderID
                - Date to the order
                - Items in the order (can have multiple)
                - Items can be in form of dictionary - user creates new item and defines the various components
                  of the item that describe it. Each time an item of the type is created these questions are
                  asked e.g. Gloss, Weight etc.
            3) Process an order
                - Will need order stages
                - Order is being developed, printed, delivered, completed
                - Can be generic so stages added when order is being created
                - Go forwards and backwards on processing
            4) Track an order
                - What stage is this order on
                - Details of cost price etc.
            5) View Order History
                - How many orders
            6) Active Orders
            7) Completed Orders
            8) Remove a customer
            9) Get Customer Details

         */
        boolean terminate = false;
        while(!terminate) {
            showMenu();
            if (processOption(getOption()) == -1){
                terminate = true;
            }
        }

        endGreeting();


    }

    private static void showMenu() {
        System.out.println("Please select a number based on your option:");
        System.out.println("1) Add a new customer");
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return(Integer.valueOf(input));
    }

    private static int processOption(int option){
        switch(option){
            case 1:
                //TODO process adding customer
                System.out.println("Adding new customer...");
                break;
            default:
                return -1;
        }
        return 0;
    }

    private static void endGreeting() {
        System.out.println("Thank you for using our software today!");
        System.out.println("Copyright: Ghusharib Chohan");
        System.out.println("Computer Science Undergraduate at Imperial College London");
    }
}
