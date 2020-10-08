/********************************************************************************
	/********************************************************************************
		        Class Account
********************************************************************************/

import java.util.Scanner; 
import java.io.*;

public class Account
{private Customer customer; 
 private String   depositsFileName; 
 private String   withdrawalsFileName; 
 private int      balance; 
 private File     inputFileObject;

/********************************************************************************
			Constructor()
******************************************************************************/
 
public Account (Customer customer) throws Exception
{//System.out.println("Enter customer name"); 
//Scanner keyboard = new Scanner(System.in); 
//String fileName = keyboard.nextLine(); 
//this.depositsFileName = customer.getName()+"_deposits"; 
System.out.println("Constructing an account for customer "
            + customer.getName());
String customerName = customer.getName(); 
this.depositsFileName = customer.getName()+"_deposits"; 
this.withdrawalsFileName = customer.getName() +"_withdrawals"; 
this.customer = customer; 
File fileObject = new File(depositsFileName); 
if (!fileObject.exists()) 
{ System.out.println("Opening a new account for " + customer.getName());
  System.out.println("Please enter deposit ammount "); 
  Scanner keyboard = new Scanner(System.in); 
  int amount = keyboard.nextInt(); 
  this.balance = 0; 
  this.deposit (amount); 
}// end if 
else 
{ System.out.println("Opening old account for "
    + this.depositsFileName);
}// end if
this.inputFileObject = fileObject;
System.out.println("Exiting Account Constructor");
}// end constructor

/***********************************************************
		Deposit (empty)
***********************************************************/
public void deposit() throws Exception

{System.out.println("Making an empty deposit");
 System.out.println("Hello" + customer.getName() + " "
    + "Please enter deposit ammount ");
//Append the deposit to the file
int deposit = 0; 
Scanner keyboard = new Scanner(System.in); 
deposit = keyboard.nextInt(); 
FileWriter fWriter = new FileWriter(this.depositsFileName, true); 
PrintWriter outputFile = new PrintWriter (fWriter); 
outputFile.println(deposit); 
outputFile.close();

// Compute the new balance 
File fileObject = new File(this.depositsFileName); 
Scanner scannerObject = new Scanner (fileObject); 
deposit = 0; 
this.balance = 0; 
while (scannerObject.hasNext())
{ deposit = scannerObject.nextInt();
this.balance = this.balance + deposit;
}
System.out.println("Balance in deposit() is " + balance); 
System.out.println("deposit() ending normally");

}// end deposit() in Account class

/***********************************************************************************
                    Deposit (amount)
************************************************************************************/
public void deposit(int amount) throws Exception
{
// Append the deposit to the file 
System.out.println("Hello making an amounted deposit"); 
System.out.println("Hello " + this.depositsFileName); 
FileWriter fWriter = new FileWriter(this.depositsFileName, true); 
    try (PrintWriter outputFile = new PrintWriter (fWriter)) {
        outputFile.println(amount);// append the deposit 
    } // append the deposit

// Compute the new balance 
File fileObject = new File(this.depositsFileName);
Scanner scannerObject = new Scanner (fileObject); 
//int deposit = scannerObject.nextInt(); 
//this.balance = this.balance + deposit; 
int deposit; 
while (scannerObject.hasNext())
{ deposit = scannerObject.nextInt();
this.balance = this.balance + deposit;
}
System.out.println("Balance in deposit() is " + this.balance);
System.out.println("deposit() ending normally");

}// end deposit() in Account class

/********************************************************************************
		withdraw()
********************************************************************************/
public void withdraw() throws Exception
{// get the amount to withdraw 
System.out.println("Your next assignment will implement withdraw()");
int withdraw = 0; 
System.out.println("How much would you like to withdraw?");
Scanner keyBoard = new Scanner (System.in); 
withdraw = 0; 
try {
	 withdraw = keyBoard.nextInt(); 
	 this.balance = this.balance - withdraw; 
}  catch(Exception e) //see pp. 705-707
{System.out.println("Withdraw() says you entered a non-numeric character" + " Please enter 1 or 2");
}
System.out.println("Current balance is " +this.balance );
System.out.println("withdraw ending normally");  


}// end withdraw() in Account class

/******************************************************************************
		getBalance()
******************************************************************************/
public int getBalance () 
{return this.balance;
}
}// end class Account}// end class Account
