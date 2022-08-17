package data;

public class Address {
  private int houseNumber;
  private String street;
  private String city;
  private String country;
  private int zipCode;

  public Address(int houseNumber, String street, String city, String country, int zipCode){
    this.houseNumber = houseNumber;
    this.street = street;
    this.city = city;
    this.country = country;
    this.zipCode = zipCode;
  }
    public int getHouseNumber(){
      return houseNumber;
  }

  public void setHouseNumber(int houseNumber){
      this.houseNumber=houseNumber;
  }

  public String getStreet(){
      return street;
  }

  public void setStreet(String street){
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
  public void display(){
    System.out.println("Address Details");
    System.out.println("houseNumber = " + houseNumber);
    System.out.println("street = " + street);
    System.out.println("city = " + city);
    System.out.println("country = " + country);
    System.out.println("zipCode = " + zipCode);
    System.out.println();
  }



}
