//package currencyexchange1;
import java.util.Scanner; 
public class CurrencyExchange1// class interface
{   // begins class definition
    public static void main(String[] args) // method interface
    {// befinning of main()definition
        
        //declare variables 
        Double dollars, francs, marks; 
        String conversionChoice;
        Scanner keyBoard;
        
        keyBoard = new Scanner(System.in);// assign a necessary object
        
        //prompt the user for for keyboard input
        System.out.println("Welcome to your new U.S. Post-Brexit European Travel App!\n");
        System.out.println("Stay tuned to your Apple store for the latest updates!\n");
        System.out.println("For currently known U.S. currency conversions, please enter one of the following:\n\r");
        System.out.println("    D to F for conversion from Dollars to Francs.");
        System.out.println("    F to D for conversion from  francs to dollars.");
        System.out.println("    D to M for conversion from Dollars to Euros.");
        System.out.println("    M to D for conversion from Euros to dollars.");
        
        conversionChoice = keyBoard.nextLine();// get the user choice
        
        if ("D to F".equals(conversionChoice))
         {  System.out.print("Please enter the Dollar amount you wish to convert to francs: ");
            dollars = keyBoard.nextDouble(); //get the amount to convert
            francs = 0.70 * dollars;// convert francs to dollars
            System.out.printf("Dollars = %f ", francs, " francs\n\n.");// display the answer
            System.out.println("Program is ending normally\n");
            System.exit(0);
         }//endsend the first decision
        if("F to D".equals(conversionChoice))
          { System.out.print("Sorry!  This feature is not quite ready.");
            System.out.println("Program is ending sorrowfully \n\")");   
            System.exit(1);                      
          }// ends he second decision
        














 System.out.println("Oops, wrong.hj");
         System.out.println("Correct error handling is the most difficult part of programming\n");
         System.exit(2); 
    }// ends main()
}// ends class definition