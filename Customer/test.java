//BS'D
public class test {
    public static void main(String[] args) {
        Person person = new Person("Zoro", "166 W23st st, NY,NY 112011", "917-333-7722");
        System.out.println(person.toString());


        Customer customer = new Customer("L-123",false);
        customer.setName("Luffy");
        customer.setAddress("876 NeverLand");
        customer.setPhoneNumber("333-222-1110");
        System.out.println("\n\n" + customer.toString());


        PreferredCustomer preferredCustomer = new PreferredCustomer(customer);
        double[] purchases = {200.00,15.00,96.00,1000.15};
        for(int i = 0; i < purchases.length; i++)
            preferredCustomer.addPurchase(purchases[i]);

        preferredCustomer.setDiscount();
        System.out.println("\n\n" + preferredCustomer.toString());


    }
}
