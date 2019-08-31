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
            Utils.showMenu();
            if (Utils.processOption(Utils.getOption()) == -1){
                terminate = true;
            }
        }

        Utils.endGreeting();


    }
}
