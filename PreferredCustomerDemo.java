//Jose Roman
//CS 1400
//Assignment 7
//11-13-19

public class PreferredCustomerDemo 
{
  public static void main(String[] args) 
  {

    //test object
    PreferredCustomer personOne = new PreferredCustomer("TJ Watt","1600 Penn St.", "555-462-8956", 90, false, 1800);
    PreferredCustomer personTwo = new PreferredCustomer("Ben Roethlisberger","710 TB St.", "555-272-1086",7, true, 1100);
    
    System.out.println("Name: " + personOne.getName());
    System.out.println("Address: " + personOne.getAddress());
    System.out.println("Phone Number: " + personOne.getPhone());
    System.out.println("Customer Number: " + personOne.getCustomer());
    System.out.println("On Mailing List: " + personOne.getMailing());
    System.out.println(personOne);                                       //toString method
    
    System.out.println("---------------------------------------------");
    
    System.out.println("Name: " + personTwo.getName());
    System.out.println("Address: " + personTwo.getAddress());
    System.out.println("Phone Number: " + personTwo.getPhone());
    System.out.println("Customer Number: " + personTwo.getCustomer());
    System.out.println("On Mailing List: " + personTwo.getMailing());
    System.out.println(personTwo);
  }
}
    