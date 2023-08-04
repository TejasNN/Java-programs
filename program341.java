// accept number from user and check whether it is an amstrong number                                                                                  )
// input : 987898   Output : 4

import java.util.*;

class Digits
{
    boolean ChkArmstrong(int iNo)
    {
        int iTemp = iNo; 

        //Count number of digits

        int iCount = 0;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        int iSum = 0, iDigit = 0, iPower = 1, iCnt = 0;

        // Logic to split the number
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            // Logic to calculate power
            for(iCnt = 1; iCnt <= iCount; iCnt++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iPower = 1;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }   
    }     
    
} // End of class Digits

class program341
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        
        boolean bRet = dobj.ChkArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }

    }   // End of main
}

/*
    Input : 371
    3^3 + 7^3 + 1^3
    27  + 343 + 1
    371 = Output
*/

// Time complexity : 