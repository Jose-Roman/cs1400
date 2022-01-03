//Jose Roman
//CS 1400
//Assignment 7
//11-13-19

public class Customer extends Person
 {
  private int customer;
  private boolean mailing;
  
  public Customer(String identity, String home, String number, int consumer, Boolean mail)
   {
   super(identity, home, number);
   customer = consumer;
   mailing = mail;
  }
  
  //set customer number
  public void setCustomer(int consumer)
  {
  customer = consumer;
  }
  
  //set mailing status
  public void setMailing(Boolean mail)
  {
  mailing = mail;
  }
  
  //get customer number
  public int getCustomer()
  {
  return customer;
  }
  
  //get mailing status
  public boolean getMailing()
  {
  return mailing;
  }
  }