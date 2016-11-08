
/**
 * This class creates the info that will be printed to the screen for the pets.
 * 
 * @author (Samuel Petty) 
 * @version (4/25/15)
 */
public class Pet
{
  private String petName;
  private String petType;
  private String weight;
  private String rabiShot;
  private String lastVisit;
 
  /**
   * This constructor gives values to my variables.
   * 
   * @param String useName, String useType, String useWeight, String useShot, String useVisit
   * @return none
   */
   public Pet(String useName, String useType, String useWeight, String useShot, String useVisit)
    {
    
        petName = useName;
        petType = useType;
        weight = useWeight;
        rabiShot = useShot;
        lastVisit = useVisit;
    }
    
  /**
   *This toString method turns my variables from my constructor into strings.
   *
   * @param none
   * @return result
   */
    public String toString( )
    {
    
    String result;
    
    result = " Pet Name: " + petName + "\nType: " + petType + "\nWeight: " + weight + "\nLast Rabies Shot: " + rabiShot + "\nLast Visit: " + lastVisit + "\n";
    
    return result;//returns the variables as strings.
    }

  
    
    
    
}
