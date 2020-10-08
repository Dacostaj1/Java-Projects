import java.io.FileNotFoundException;
import java.util.Scanner;

public class Costa_J_Asn9 
{

    
    public static void main(String[] args) throws FileNotFoundException
    {   System.out.println("This program manipulates single dimension arrays");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of your file");
        int fileSize;
        int arraySize;
        try
        {   String fileName = keyboard.nextLine();
            fileSize = getFileLength(fileName);
            arraySize = fileSize;
            String[] fileArray = new String[arraySize]; // create memory space
            initializeFile(arraySize, fileArray);
            displayArray(arraySize, fileArray);
        String[] filesArray = null;
            loadFileArray(fileSize, fileName, fileArray);
            displayArray(arraySize, fileArray);      
        }// end try block
        catch(FileNotFoundException ex)
        {System.out.println("Please correct the file name and run again");
        }
    }// end main()
    
    
 /*******************************************************************************   
        *                   INITIALIZE FILE ARRAY
********************************************************************************/    
    
    
    public static void initializeFile(int arraySize, String[] ar)
    {   System.out.println("Initializing file");
        for (int i = 0; i < arraySize; i++)
        {     
               ar[i] = "noValue";
        }// end for 
    }// end initializeFile()
    
    
    
    
    
    
    /*******************************************************************************   
        *                   GET FILE LENGTH
********************************************************************************/    
    
    
    public static int getFileLength(String fileName) throws FileNotFoundException
    {   System.out.println("Counting " + fileName);
        java.io.File fileObject; //decalre the reference variable
        fileObject = new java.io.File (fileName); //create the file object
        Scanner scannerObject = null; //declare a reference variable
        try
            {scannerObject = new Scanner(fileObject); //create scanner object
            }
        catch (Exception e) //catch (FileReading.FileNotFoundException ex)
            {System.out.println("Exception caught in getFileLength()");
             System.out.println("Throwing exception to main()");
             System.out.println();
             throw e; //let main() further handle this exception
            }
        int numRecords = 0;
        while(scannerObject.hasNextLine())
            {numRecords++; //Count the number of records in the file
            if (scannerObject.nextLine() == null)
                break;
            }// end while
        scannerObject.close(); //close the scanner object
        return numRecords;
    }// end getFileLength() 





/*******************************************************************************   
        *                   LOAD FILE into the array
********************************************************************************/    


    public static void loadFileArray(int fileSize, String fileName, String[] a) throws FileNotFoundException
    {   System.out.println("Loading your file");
        java.io.File fileObject; //create the reference variable
        fileObject = new java.io.File (fileName); //create the file object
        Scanner scannerObject = null; //declare a reference variable
        scannerObject = new Scanner(fileObject); //create the scanner object
        int i = 0;
        String s;
        String record;
        while(i < fileSize)
            {record = scannerObject.nextLine();
             a[i] = record; //copy the file record into the array element
             System.out.println(" load file record is " + record);
             i++;
            }// end while
        scannerObject.close(); //close the file
    }// end loadFileArray()
    
    
    
    
    /*******************************************************************************   
        *                   DISPLAY ARRAY
********************************************************************************/    


    public static void displayArray(int arraySize, String[] a)
    {   System.out.println("Dsiplaying your file");
        for (int i = 0; i < a.length; i++)
            {System.out.println(a[i] + "\n");
            }// end for
    }// end displayArray()
    
    
    
       



} //end class
