import java.util.Scanner;

public class ProcessTask {

    protected static Customer addNewCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String FirstName = scanner.nextLine();
        System.out.println("Second Name: ");
        String Surname = scanner.nextLine();
        System.out.println("Business Name: ");
        String BusinessName = scanner.nextLine();
        System.out.println("Address: ");
        String Address = scanner.nextLine();
        return new Customer(0, FirstName, Surname, Address, BusinessName);
    }
}
