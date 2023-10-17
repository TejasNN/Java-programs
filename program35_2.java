/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number from user and return the count of odd digits.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Digits
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0, iOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iOdd++;
            }
            iNo = iNo / 10;
        }
        return iOdd;
    }
}

class program35_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountOdd(iValue);

        System.out.println("The number of odd digits are : "+iRet);
    }
}
