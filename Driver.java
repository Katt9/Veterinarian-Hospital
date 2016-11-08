import java.util.*;
import java.io.*;
/**
 * This driver class allows the user to type in a file that they would like to use and it prints it to
 * the screen.
 * 
 * @author (Samuel Petty) 
 * @version (4/25/15)
 */
public class Driver
{
 public static void main(String [ ] args) throws IOException
 {
  Client [ ] info = new Client [5];//creates client array that holds 5 clients.
  Pet [ ] form ;//creates pet array
  String inFirstName, inLastName, inUseAddr, inVisits, inBalance;
  String pet, type, pweight, shot, visit;
  String filename;
  StringTokenizer str;
  Scanner inputFile;//creates a Scanner object.
  Scanner input = new Scanner (System.in);//allows the user to type in the file they want to use.
  System.out.println("Enter the name of your file: ");
  filename = input.nextLine();
  inputFile = new Scanner(new File(filename));//allows the user to input the file.
  int arrayPet,inUseId;
  
  for(int i = 0; i < info.length; i++)
  {
      
 if (inputFile.hasNext())
   {
   str = new StringTokenizer(inputFile.nextLine(),", ");//turns the strings created into tokens/substrings.
   inFirstName = str.nextToken( );//reads in the first name of client from file. 
   inLastName = str.nextToken( );//reads in the last name of client from file.
   inUseId = Integer.parseInt(str.nextToken( ));//reads in the ID of client from file as an int and turns in into a String.
   inUseAddr = str.nextToken( );//reads in the address of client from file.
   inVisits = str.nextToken( );//reads in the number of visits of the client from file as a String.
   inBalance = str.nextToken( );//reads in the balance of the client from file as a String.
   arrayPet = Integer.parseInt(str.nextToken( ));
   form = new Pet [arrayPet];
  for(int e = 0; e < form.length; e++)
  {
 if (inputFile.hasNext())
   {
    str = new StringTokenizer(inputFile.nextLine(),", ");//turns the strings created into tokens/substringa.
    pet = str.nextToken( );//reads in the pet name from the file.
    type = str.nextToken( );//reads in the pet type from the file;
    pweight = str.nextToken( );//reads in the weight of the pet from the file.
    shot = str.nextToken( );//reads in the date of the pet's rabies shot from the file.
    visit = str.nextToken( );//reads in the date of the pet's last visit from the file.
    form[e] = new Pet (pet, type, pweight, shot, visit);//gives my pet array values to read in.
}
    }
  info[i] = new Client (inFirstName, inLastName, inUseId, inUseAddr, inVisits, inBalance, arrayPet, form);//gives my client array values to read in.
}   
    for(int el = 0; el < info.length; el++)
  {
   System.out.println(info[el]);//prints the info from the file.
}  
input.close( );}//closes the input file.
}
     
    }
  
  

  
    
    
    
    
    
    
    


    

