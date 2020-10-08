public class Jose_Costa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
     * @param args the command line arguments
     */
    private static String years;
    public static void main(String[] args) throws IOException
    {   System.out.println("Program is starting.");
        System.out.println();
            final int maxChoice = 3;
            int choice;
        do
        {   System.out.println("Enter:");
            System.out.println("1 to make a deposit.");
            System.out.println("2 to make a withdraw.");
            System.out.println("3 to calculate investmenthorizon.");
            System.out.println("0 to quit.");
            Scanner keyBoard;
            keyBoard = new Scanner(System.in);
            int balance = 0;
            String customerName;
            //keyBoard.nextInt();// consumes ewlines in input buffer, see pp.88
            //choice = 0;
            choice = keyBoard.nextInt();
                 if (choice == 0)
                {System.out.println("Program quitting as requested");
                System.exit(0);
                }//end if
            else if (choice == 1)// deposit
            { System.out.println("Deposit:  Please enter your name.");
              keyBoard.nextLine();
              customerName = keyBoard.nextLine();
              balance = deposit(customerName);
              System.out.println("Your balance is now " + balance);
            }// end if
            else if (choice == 2)// withdraw
            { System.out.println("Withdrawal:  Please enter your name.");
              keyBoard.nextLine();
              customerName = keyBoard.nextLine();
              balance = withdraw(customerName);
            }// end if
             else if (choice == 3)// investment horizon
            { System.out.println("Investment horizon");
              double horizon = calcInvHorizon();
              //System.out.println("Your investment horizon is " + horizon + years);
            }// end if
        }while ((choice >= 0) && (choice <= maxChoice));
         System.out.println("Program stopping at state error state 1");
         System.exit(1);
    }// end main()




   public static int deposit(String fileName) throws IOException 
{
   File fileObject = null;
   fileObject = new File(fileName);
   if (!fileObject.exists())  


   {
    System.out.println("Opening a new account for " +fileName);
   }   

 int deposit = 0; 
 System.out.println("Hello " +fileName+" Please enter deposit amount"); 
 Scanner keyBoard = new Scanner (System.in); 
 deposit = keyBoard.nextInt(); 

	}
FileWriter fWriter = new FileWriter(fileName, true);
PrintWriter outputFile = new PrintWriter (fWriter);
outputFile.println(deposit);
outputFile.close();

Scanner inputFileObject = new Scanner(fileObject);
int balance = 0; 
deposit = 0; 
while (inputFileObject.hasNext())


{
 deposit = inputFileObject.nextInt(); 
 balance = balance + deposit;   

}

System.out.println("Balance in deposit is " +balance );
System.out.println("deposit ending normally");  
return balance; 
}


   public static int withdraw(String customerName) throws IOException 
{
File fileObject = null; 
fileObject = new File(customerName);
if (!fileObject.exists())



{ System.out.println("Sorry, you must have entered an incorrrect name. ");
  return 1;
} 


else

{ int withdraw = 0; 

System.out.println("How much would you like to withdraw");
Scanner keyBoard = new Scanner (System.in); 
  withdraw = keyBoard.nextInt(); 


FileWriter fWriter = new FileWriter(customerName, true);
PrintWriter outputFile = new PrintWriter (fWriter);
outputFile.println(withdraw);
outputFile.close();

Scanner inputFileObject = new Scanner(fileObject);
int balance = 0; 
withdraw = 0; 
while (inputFileObject.hasNext())

{
 withdraw = inputFileObject.nextInt(); 
 balance = -balance + withdraw; 
}
System.out.println("Balance in is " +balance );
System.out.println("withdraw ending normally");  
return balance; 
}
 }//end withdraw

    private static double calcInvHorizon() 
    {
        Scanner keyBoard = new Scanner (System.in);

        double presentValue, currentValue, annualInterestRate, futureValue;

        System.out.println("PV:");
        presentValue = keyBoard.nextDouble();
        currentValue = presentValue;

        System.out.println("FV:");
        futureValue = keyBoard.nextDouble();

        System.out.println("i:");
        annualInterestRate = keyBoard.nextDouble();


        int numMonths = 1;         
        double monthlyInterestRate = annualInterestRate / 12.0;       
        currentValue = presentValue;         
        //double futureValue;
        while(currentValue < futureValue)   
                 { currentValue = currentValue *(1.0 + monthlyInterestRate /100.0);               
                   numMonths++;             
                 } // end while       
                 double horizon = numMonths / 12.0;

                 System.out.println("horizon is " +horizon);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

}