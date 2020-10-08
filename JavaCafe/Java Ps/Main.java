import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
        public static void main(String[] args) throws Exception
    {   System.out.println("This program demontrates object oriented design" + "and multidimensional arrays");
        String bankName = "BankAmerica";
	Bank bankObject = new Bank(bankName);
	bankObject.displayEuropeanCities();
	bankObject.displayHouston_Districts();
        bankObject.display_Houston_District_5_Addresses();
    int maxChoice = 3;
	int choice = 0;
        do
        {   int balance = 0;
	    Customer customer = new Customer();
            Account account = new Account (customer);
	    System.out.println("Enter:");
            System.out.println("1 to deposit.");
            System.out.println("2 to withdraw.");
            System.out.println("0 to quit.");
            Scanner keyBoard;
            keyBoard = new Scanner(System.in);
            try{choice = keyBoard.nextInt();}
            catch(InputMismatchException e) // see pp. 705-707
            {System.out.println("You entered a non-numeric character." + " Please enter 1,2, or 0. ");
            continue; // stops this iteration of the loop and begins the next
      }
      
        switch (choice) {
        // deposit
        // end if
            case 1:
                System.out.println("Deposit");
                account.deposit();
                System.out.println( "Main() Your balance is now" + account.getBalance());
                break;
        // withdraw
        // end if
            case 2:
                account.withdraw();
                System.out.println("Main Your balance is now" + account.getBalance());
                System.out.println("Your balance is now" + balance);
                break;
        // end if
            case 0:
                System.out.println("Program quitting as requested");
                System.exit(0);
            default:
                break;
        }
     }while ((choice >=0) && (choice <= maxChoice));
   }// end main()
}// end class Main