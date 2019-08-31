public class Customer {

    /*  Class to define what information is to be stored on a customer including their unique ID
        and business details as required. CustomerID is final to ensure once locked in you cannot
        change the CustomerID ensuring it is unique.
     */

    private final int CustomerID;
    private String FirstName, Surname, Address, BusinessName;

    public Customer(int CustomerID, String FirstName, String Surname, String Address, String BusinessName) {
        this.CustomerID = CustomerID;
        this.FirstName = FirstName;
        this.Surname = Surname;
        this.Address = Address;
        this.BusinessName = BusinessName;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public String getAddress() {
        return Address;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }
}
