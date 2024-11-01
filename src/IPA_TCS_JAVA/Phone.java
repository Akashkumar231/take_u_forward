package IPA_TCS_JAVA;

public class Phone {

    int phoneId;
    String OS;
    String brand;
    int price;

    public Phone(int a,String b , String c ,int d){
        this.phoneId=a;
        this.OS = b;
        this.brand = c;
        this.price=d;
    }

    public int getPhoneId(){
        return this.phoneId;
    }

    public String getOS(){
        return this.OS;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

}
