//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number from user and return the count of digits in between 3 and 7.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Digits
{
    public int CountRange(int iNo)
    {
        int iDigit = 0, iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program35_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountRange(iValue);

        System.out.println("The number of digits between 3 and 7 are : "+iRet);
    }
}
