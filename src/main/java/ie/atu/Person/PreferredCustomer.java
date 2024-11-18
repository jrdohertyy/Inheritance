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

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            this.loyaltyPoints += points;
            setDiscountLevel();
        } else {
            System.out.println("Points to add must be positive.");
        }
    }


    public void setDiscountLevel() {
        if(this.loyaltyPoints >= 2000){
            this.discountLevel = 10;
        }
        else if(this.loyaltyPoints >= 1500){
            this.discountLevel = 7;
        }
        else if(this.loyaltyPoints >= 1000){
            this.discountLevel = 6;
        }
        else if(this.loyaltyPoints >= 500){
            this.discountLevel = 5;
        }
        else{
            this.discountLevel = 0;
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel;
    }


}



