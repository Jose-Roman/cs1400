//Jose Roman
//CS 1400
//Assignment 7
//11-13-19

public class Person
 {
  private String name;
  private String address;
  private String phone;
  
  //constructor
  public Person(String identity, String home, String number)
  {
    name = identity;
    address = home;
    phone = number;
  }
  
  public void setName(String identity)             //getters and setters for name, address, phone
  {
    name = identity;
  }
  
  public void setAddress(String home)
  {
    address = home;
  }
  public void setPhone(String number)
  {
    phone = number;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getAddress()
  {
    return address;
  }
  public String getPhone()
  {
    return phone;
  }
}