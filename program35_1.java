/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number from user and return the count of even digits.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Digits
{
    public int CountEven(int iNo)
    {
        int iDigit = 0, iEven = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iEven++;
            }
            iNo = iNo / 10;
        }
        return iEven;
    }
}

class program35_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountEven(iValue);

        System.out.println("The number of even digits are : "+iRet);
    }
}
