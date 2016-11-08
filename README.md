
/**
 * This class creates an array for the clients and aggregates the Pet class with the Client class.
 * 
 * @author (Samuel Petty) 
 * @version (4/25/15)
 */
public class Client
{
   private String nameLast;
   private String nameFirst;
   private String address;
   private int id;
   private String numVisits;
   private String outBalance;
   private Pet [ ] form;
   private int petNum;
   
   
    
    /**
     * 
     * This constructor sets the values for my variables and aggregates the Pet class with the Client class.
     * 
     * @param String first, String last, int userId, String userAddr, String visits, String balance, int numPet, Pet [] arrayPets
     * @return none
     */
   public Client (String first, String last, int userId, String userAddr, String visits, String balance, int numPet, Pet [] arrayPets)
    {
    form = arrayPets;//aggregates the Pet class.
    nameFirst = first;
    nameLast = last;
    id = userId;
    address = userAddr;
    numVisits = visits;
    outBalance = balance;
    
   
    }
    
    
 /**
  * Equals method that checks to see if client ID's match or not.
  * 
  * @param Client inClient
  * @return inClient.id
  */   
  public boolean equals (Client inClient)
    {
   return this.id == inClient.id;//checks to see if client ID's match
     
}
/**
 * 
 * This toString method turns my values from my constructor into strings.
 * 
 * @param none
 * @return results
 */
public String toString ()
    {
    String results;
    results = "Last Name: " + nameLast + "\nFirst Name: " + nameFirst + "\nID Number: " + id + "\nAddress: " + address + "\nVisits: " + numVisits + "\nBalance: " + outBalance
    + "\n";//turns variables into strings.
    for(int i = 0; i < form.length; i++)
    {
    results += form [i];
    }
    
    return results;//returns the variables as strings.
    
    }
    
   
    
}
