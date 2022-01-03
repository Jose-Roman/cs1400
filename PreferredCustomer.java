//Jose Roman
//CS 1400
//Assignment 7
//11-13-19

public class PreferredCustomer extends Customer
 {
  private double purchase;
 
     //constructor
     public PreferredCustomer(String identity, String home, String number, int consumer, Boolean mail, double cost)
     {
      super(identity, home, number, consumer, mail);         //super keyword from customer class
      purchase = cost;
     }
    
    public void setPurchase(double cost)
    {
    purchase = cost;
    }
   
    public double getPurchase() 
    {
    return purchase;
    }
 
   //get discount percentage
   public double getDiscount() 
   {
   double discount;
   
   if(purchase >= 2000)
     discount = 10.0;
   else if(purchase >= 1500)
     discount = 7.0;
   else if(purchase >= 1000)
     discount = 6.0;
   else if(purchase >= 500)
     discount = 5.0;
   else
      discount = 0.0;
   return discount;
   }
   public String toString()
   {
    String str = "Customer Amount Spent: $" + getPurchase() + "\nDiscount: " + getDiscount() + "%";
    return str;
   
   }
   }