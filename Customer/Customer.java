public class Customer extends Person {
    private String customerID;
    private boolean mailingList;

    public Customer(String customerID, boolean mailingList) {
        super();
        setCustomerID(customerID);
        this.mailingList = mailingList;
    }

    public Customer(String name, String address, String phoneNumber, String customerID, boolean mailingList) {
        super(name,address,phoneNumber);
        setCustomerID(customerID);
        this.mailingList = mailingList;
    }

    public Customer(Person person, String customerID, boolean mailingList) {
        super(person.getName(), person.getAddress(), person.getPhoneNumber());
        setCustomerID(customerID);
        this.mailingList = mailingList;
    }

    private boolean validateCustomerID(String customerID) {
        if(!Character.isLetter(customerID.charAt(0))) {
            return false;
        }
        if(customerID.charAt(1) != '-')
            return false;
        for(int i = 2; i < customerID.length(); i++)
            if(!Character.isDigit(customerID.charAt(i)))
                return false;
        return true;
    }

    public void setCustomerID(String customerID) {
        if(validateCustomerID(customerID) == true)
            this.customerID = customerID;
        else
            this.customerID = "Invalid Entry: (format: L-XXX)";
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public String getCustomerID() {
        return customerID;
    }

    public boolean getMailingList() {
        return mailingList;
    }

    public String toString() {
        String s = super.toString() + "\nClient ID: " + this.customerID + "\nMail subscription: ";
        if(this.mailingList == true)
            s += "On";
        else
            s += "Off";
        return s;
    }

}
