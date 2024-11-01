package IPA_TCS_JAVA;

public class TravelAgencies {


  private   int regNo;
  private   String agencyName;
  private   String packageTye;
  private  int price;
   boolean flightFacility;

  public TravelAgencies(int regNo , String agencyName , String packageTye , int price , boolean fc){

      this.regNo = regNo;
      this.agencyName = agencyName;
      this.packageTye=packageTye;
      this.price = price;
      this.flightFacility=fc;


  }

  public boolean getFlightFacility(){
      return this.flightFacility;
  }

  public int getPrice(){
      return this.price;
  }

  public String getPackageTye(){
      return this.packageTye;
  }

  public int getRegNo(){
    return   this.regNo;
  }

  public String getAgencyName(){
      return this.agencyName;
  }

}
