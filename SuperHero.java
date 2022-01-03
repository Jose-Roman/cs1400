//Jose Roman
//CS1400
//Assignment 4
//10/9/2019

public class SuperHero
{
  private String name;        //hold the name of the superhero
  private String superPower;   //hold the power
  private String catchPhrase;   //hold the superhero's catch phrase

  //constructor
  public SuperHero(String identity, String power, String phrase)
    {
     name = identity;
     superPower = power;
     catchPhrase = phrase;
    }
  //stores name
  public void setName(String identity)
    {
     name = identity;
    }

  //stores power
  public void setPower(String power)
    {
     superPower = power;
    }

  //stores catch phrase
  public void setCatchPhrase(String phrase)
    {
     catchPhrase = phrase;
    }

  //returns name
  public String getName()
    {
     return name;
    }

  //returns power
  public String getPower()
    {
     return superPower;
    }

  //returns catch phrase
  public String getCatchPhrase()
    {
     return catchPhrase;
    }

  //prints catch phrase
  public void sayCatchphrase()
    {
     System.out.println(catchPhrase);
    }
}
