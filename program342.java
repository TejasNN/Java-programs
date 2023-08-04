// accept number from user and check whether it is an amstrong number
// input : 987898   Output : 4

import java.util.*;

class Digits
{
    int CountDigits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }

    int Power(int X, int Y)
    {
        int iPower = 1, iCnt = 0;

        for(iCnt = 1; iCnt <= Y; iCnt++)
        {
            iPower = iPower * X;
        }
        return iPower;
    }

    boolean ChkArmstrong(int iNo)
    {
        int iSum = 0, iDigit = 0, iCount = 0, iRet = 0;

        iCount = CountDigits(iNo);
        
        int iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = Power(iDigit,iCount)
            iSum = iSum + iRet;
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

class program342
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