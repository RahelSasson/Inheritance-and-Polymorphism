//BS'D
/*
Design a class named Person with fields for holding a person’s name, address, and telephone
number. Write one or more constructors and the appropriate mutator and accessor methods
for the class’s fields.
Next, design a class named Customer, which extends the Person class. The Customer class should
have a field for a customer number and a boolean field indicating whether the customer wishes
to be on a mailing list. Write one or more constructors and the appropriate mutator and accessor
methods for the class’s fields. Demonstrate an object of the Customer class in a simple program.
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person(){}

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        setPhoneNumber(phoneNumber);
    }

    private boolean validatePHoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 12) {
            return false;
        }
        if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(7) != '-') {
            return false;
        }
        String[] phoneNumberArr = phoneNumber.split("-");

        for (int i = 0; i < phoneNumberArr.length; i++) {
            for (int j = 0; j < phoneNumberArr[i].length(); j++) {
                if (!(Character.isDigit(phoneNumberArr[i].charAt(j))))
                    return false;
            }
        }
        return true;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(validatePHoneNumber(phoneNumber) == true)
            this.phoneNumber=phoneNumber;
        else
            this.phoneNumber = "Invalid Entry: (format: xxx-xxx-xxxx)";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber;
    }
}
