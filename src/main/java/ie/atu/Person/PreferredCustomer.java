package ie.atu.Person;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints, discountLevel;

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phone, String custNumber, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(name, address, phone, custNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public void setLoyaltyPoints(){
        this.loyaltyPoints = loyaltyPoints;
    }

    public int addLoyaltyPoints(int loyaltyPoints){
        return loyaltyPoints;
    }

    public void setDiscountLevel(){
        this.discountLevel = discountLevel;
    }

    public int addDiscountLevel(int discountLevel){
        return discountLevel;
    }

}



