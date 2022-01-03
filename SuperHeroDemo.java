//Jose Roman
//CS1400
//Assignment 4
//10/9/2019

public class SuperHeroDemo
{
  public static void main(String args[])
    {
     SuperHero Hulk = new SuperHero("The Hulk", "Super Strength", "HULK SMASH");
     
     //display name and powers
     System.out.println("The superhero's name is " + Hulk.getName());
     System.out.println("His superpower is " + Hulk.getPower());
    
     //use say catch phrase method
     Hulk.sayCatchphrase();
     System.out.println();    //formatting

     SuperHero HumanTorch = new SuperHero("The Human Torch", "Turn himself into fire", "Flame On!");

     System.out.println("The superhero's name is " + HumanTorch.getName());
     System.out.println("His superpower is " + HumanTorch.getPower());
     HumanTorch.sayCatchphrase();
     System.out.println();

     SuperHero Spiderman = new SuperHero("Spiderman", "Wall-crawling, enhanced strength, speed.", "My spideys senses are tingling.");
     
     System.out.println("The superhero's name is " + Spiderman.getName());
     System.out.println("His superpower's are " + Spiderman.getPower());
     Spiderman.sayCatchphrase();
     
    }
}
