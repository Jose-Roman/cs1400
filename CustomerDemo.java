//Jose Roman
//CS 1400
//Assignment 7
//11-13-19

public class CustomerDemo
{
  public static void main(String[] args) 
  {

    //create Customer object
    Customer personOne = new Customer("Minkah Fitzpatrick", "524 S.5th St.", "555-641-2942", 39, true);
    Customer personTwo = new Customer("JuJu Smith Schuster", "1032 N. Forbes", "555-881-3192", 19, false);
    
    System.out.println("Name: " + personOne.getName());                     //get name
    System.out.println("Address: " + personOne.getAddress());               //get address
    System.out.println("Phone Number: " + personOne.getPhone());            //get phone number
    System.out.println("Customer Number: " + personOne.getCustomer());        //get customer number
    System.out.println("On Mailing List: " + personOne.getMailing());           //get mailing list status
    System.out.println("---------------------------------------------");
    
    System.out.println("Name: " + personTwo.getName());
    System.out.println("Address: " + personTwo.getAddress());
    System.out.println("Phone Number: " + personTwo.getPhone());
    System.out.println("Customer Number: " + personTwo.getCustomer());
    System.out.println("On Mailing List: " + personTwo.getMailing());
  }
}
    