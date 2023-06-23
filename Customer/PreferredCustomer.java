import java.util.ArrayList;
import java.util.List;

//BS'D
/*
A  retail store has a preferred customer plan where customers can earn discounts on all their
purchases. The amount of a customer’s discount is determined by the amount of the customer’s cumulative purchases in the store as follows:
•	 When a preferred customer spends $500, he or she gets a 5 percent discount on all
future purchases.
•	 When a preferred customer spends $1,000, he or she gets a 6 percent discount on all
future purchases.
•	 When a preferred customer spends $1,500, he or she gets a 7 percent discount on all
future purchases.
•	 When a preferred customer spends $2,000 or more, he or she gets a 10 percent discount on all future purchases.
Design a class named PreferredCustomer, which extends the Customer class you created.
 */
public class PreferredCustomer extends Customer{
    private List<Double> customerPurchases = new ArrayList<>();
    private double totalPurchases;
    private double discount;

    public PreferredCustomer(Customer customer) {
        super(customer.getName(),customer.getAddress(),customer.getPhoneNumber(), customer.getCustomerID(), customer.getMailingList());
        this.totalPurchases = 0;
        this.discount = 0;
    }

    public void addPurchase(Double purchase) {
        this.customerPurchases.add(purchase);
    }

    private void setTotalPurchases() {
        for(int i = 0; i < customerPurchases.size(); i++)
            this.totalPurchases += customerPurchases.get(i);
    }

    public void setDiscount() {
        setTotalPurchases();
        if(totalPurchases < 500)
            this.discount = 0;
        else if(totalPurchases < 1000)
            this.discount = 5;
        else if(totalPurchases < 1500)
            this.discount = 6;
        else if(totalPurchases < 2000)
            this.discount = 7;
        else
            this.discount = 10;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public double getDiscount() {
        return discount;
    }

    public String toString() {
        return super.toString() + "\nPreferred Customer Total Purchases: " + this.totalPurchases +
                "\n Discount on all future purchases: " + this.discount + "%";
    }
}
