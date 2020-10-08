//package asn3_costa;
import java.util.Scanner; 
public class Asn3_Costa// class interface
{   // begins class definition
    public static void main(String[] args) // method interface
    {// begin main()definition
        
        String stopFlag="g";//go
        System.out.println("Welcome to your new U.S. Post-Brexit European Travel App!\n");
        System.out.println("Stay tuned to your Apple store for the latest updates!\n");
        stopFlag = exchange();// make initial call to exchange() method
        while (stopFlag.equals("g"))//state is continue
          {stopFlag = exchange();// get the value of stop flag from our new method exchange()
          }// end while loop
        System.out.println("Program is ending normally\n");
    }// end main()definition
        
    
    public static String exchange() // exchange() begins
     {  Double dollars = null, francs, Euros; 
        String conversionChoice, state;
        Scanner keyBoard; //declare the keyboard's variable class
        keyBoard = new Scanner(System.in);// create a new Scanner object
        
        //prompt the user for for keyboard input
        //char state = 'g';//
        state = " ";
        System.out.println("\nFor currently known U.S. currency conversions, please enter one of the following:\n");
        System.out.println("    D to F for conversion from Dollars to Francs.");
        System.out.println("    F to D for conversion from  francs to dollars.");
        System.out.println("    D to M for conversion from Dollars to Euros.");
        System.out.println("    M to D for conversion from Euros to dollars.\n\r");
        System.out.println("or q to quit.\n\r");
        conversionChoice = keyBoard.nextLine();// get the user choice
      
        if ("D to F".equals(conversionChoice))
         {  System.out.print("Please enter the number of dollars you wish to convert to francs: ");
            dollars = keyBoard.nextDouble(); //get the amount to convert
            francs = 0.75 * dollars;// convert francs to dollars
            //System.out.printf("Dollars = %f ", francs, " francs\n\n.");
            System.out.printf("%.3f Dollars = %.3f francs.", dollars, francs);
            state = "g"; 
            return state;
         }// ends first decision// display the answer
        if("F to D".equals(conversionChoice))
          { System.out.print("Please enter the number of francs you wish to convert to dollars.");
            francs = keyBoard.nextDouble(); //get the amount to convertfrancs = keyBoard.nextDouble();
            dollars = 0.5 *  francs;
            System.out.printf("%.3f francs = %.3f dollars.", francs, dollars);
            state = "g";
            return state;
          }// ends he second decision
         
        if("D to M".equals(conversionChoice))
          { System.out.print("Please enter the number of dollars you wish to convert to euros.");
            dollars = keyBoard.nextDouble(); //get the amount to convertfrancs = keyBoard.nextDouble();
            Euros = 0.77 *  dollars;
            System.out.printf("%.3f dollars = %.3f euros.", dollars, Euros);
            state = "g";
            return state;
          }// ends he second decision

       if("M to D".equals(conversionChoice))
          { System.out.print("Please enter the number of euros you wish to convert to dollars.");
            Euros = keyBoard.nextDouble(); //get the amount to convertfrancs = keyBoard.nextDouble();
            dollars = 0.70 *  Euros;
            System.out.printf("%.3f euros = %.3f dollars.", Euros, dollars);
            state = "g";
            return state;
          }// ends he second decision
        
	System.out.println("!!!!!Ooooops. Wrong Answer. Big embarrasing for a MIS student!!!!!");
        System.out.println("!!!!!Fix the error handling is the most difficult part of programming!!!!\n");
        //state = conversionChoice.charAt(1);
        state = "e";
        return state;
    }// ends exhange() method
   
}// ends class definition
    
   
    
