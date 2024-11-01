package ipaexampractise;

public class Customer {

    private int customer_Id;

    private String customer_Name ;

    private int customer_Bill;

    public Customer(int customer_Id,String customer_Name , int customer_Bill){
        this.customer_Id=customer_Id;
        this.customer_Name=customer_Name;
        this.customer_Bill=customer_Bill;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public int getCustomer_Bill() {
        return customer_Bill;
    }

    public void setCustomer_Bill(int customer_Bill) {
        this.customer_Bill = customer_Bill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id=" + customer_Id +
                ", customer_Name='" + customer_Name + '\'' +
                ", customer_Bill=" + customer_Bill +
                '}';
    }
}
