////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number from user and return the difference between the summation of even and odd digits.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Digits
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0, iEven = 0, iOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iEven = iEven + iDigit;
            }
            else
            {
                iOdd = iOdd + iDigit;
            }
            iNo = iNo / 10;
        }
        return iEven - iOdd;
    }
}

class program35_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number : ");

        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDiff(iValue);

        System.out.println("The difference between the summation of even and odd digits is : "+iRet);
    }
}