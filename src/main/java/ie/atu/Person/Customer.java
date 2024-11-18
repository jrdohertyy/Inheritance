package ie.atu.Person;

public class Customer extends Person {
    private String custNumber;
    private boolean mailingList;

    public Customer() {
        this.custNumber = "";
        this.mailingList = false;
    }

    public Customer(String name, String address, String phone, String custNumber, boolean mailingList) {
        super(name, address, phone);
        this.custNumber = custNumber;
        this.mailingList = mailingList;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + ", custNumber='" + custNumber + '\'' +
                ", mailingList=" + mailingList;
    }

}