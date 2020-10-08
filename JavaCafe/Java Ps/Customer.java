/********************************************************************************
			Class customer
********************************************************************************/
import java.util.Scanner; 


public class Customer 
{private final String name;

/******************************************************************************
			Constructor()
******************************************************************************/
public Customer() // throws Exception
{ System.out.println("Constructing a customer"); 
System.out.println("Enter customer name"); 
Scanner keyboard = new Scanner (System.in); 
this.name = keyboard.nextLine();

}// end constructor 
public String getName() 
{return this.name;
}
} // end class customer
