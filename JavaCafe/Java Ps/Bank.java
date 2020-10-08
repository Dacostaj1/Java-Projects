/**************************************************************************************
			        Bank class
**************************************************************************************/

 
public class Bank 
{private final String bankName;

final private int NREGNS  = 5;
final private int NCITIES = 5;
final private int NDISTS  = 9;
final private int NADDRS  = 9;
private final String[] [] [] []orgStruct=new String [NREGNS] [NCITIES] [NDISTS] [NADDRS];

/* *******************************************************************************
/* Constructor *******************************************************************
**********************************************************************************

*/ Bank (String bankName) 
{ this.bankName = bankName;

   /* This Bank class uses an array with 4 dimensions to maintain it's
      organizational structure

      The 4 dimesions refer to the four levels in the organization: 
      Level 1 corresponds the regions of the world (US, Canada, etc.) 
      level 2         ''       cities in the regions 
      level 3         ''       districts in the cities 
      level 4         ''       addresses of the banks in the districts

*/

//Load 4 Cities in Us 
orgStruct[0][0][0][0] = "Houston ";
orgStruct[0][1][0][0] = "NewYork"; 
orgStruct[0][2][0][0] = "Boston";
orgStruct[0][3][0][0] = "Cleaveland";
   
// Load 4 Cities in Europe 
orgStruct[1][0][0][0] = "London"; 
orgStruct[1][1][0][0] = "Paris"; 
orgStruct[1][2][0][0] = "Amsterdam"; 
orgStruct[1][3][0][0] = "Rome";

// Load 8 Districts in Houston
orgStruct[0][0][0][0] = "HDIST0";
orgStruct[0][0][1][0] = "HDIST1"; 
orgStruct[0][0][2][0] = "HDIST2";
orgStruct[0][0][3][0] = "HDIST3";
orgStruct[0][0][4][0] = "HDIST4";
orgStruct[0][0][5][0] = "HDIST5"; 
orgStruct[0][0][6][0] = "HDIST6";
orgStruct[0][0][7][0] = "HDIST7";
orgStruct[0][0][8][0] = "HDIST8";


// Load 4 Addresses in Houston District 5 
orgStruct[0][0][5][5] = "HDist 5 addr5.1";
orgStruct[0][0][5][6] = "HDist 5 addr5.2";
orgStruct[0][0][5][7] = "HDist 5 addr5.3";
orgStruct[0][0][5][8] = "HDist 5_addr5.4"; 

}// end constructor

/* ************************************************************************
Display US CItiews *******************************************************
************************************************************************
*/ 
void displayusCities()
{ String city; 
System.out.println("displaying US cities");
for (int i = 0; i < NCITIES-1; i++) 
{city = orgStruct[0][i][0][0];
System.out.println(city);
} // end for 
}// end display US cities

/* *************************************************************************
Display Euopean Citiews *************************************************
************************************************************************
*/

void displayEuropeanCities ()
{ String city; System.out.println("displaying European cities");
for (int i = 0; i < NCITIES-1; i++) 
{city = orgStruct[1][i][0][0];
System.out.println(city);
}// end for 
}// end display European cities

/* *************************************************************************
Display Districts in Houston *********************************************
**************************************************************************
*/
void displayHouston_Districts()
{ String city; System.out.println("displaying Houston Districts");
for (int i = 0; i < NDISTS; i++) 
{city = orgStruct[0][0][i][0];
System.out.println(city);
}// end for 
}// end display Houston Districts 

/* ************************************************************************
Display Addresses in Houston District5 ***********************************
*/
 void display_Houston_District_5_Addresses ()
{ String city; System.out.println("displaying addresses in houston District 5");
for (int i = 5; i < NDISTS; i++) 
{city = orgStruct[0][0][5][i];
System.out.println(city);
}// end for }
}// end display Houston District_5 Addresses 
}// end class Bank