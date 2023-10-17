//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number from user and return the multiplication of all the digits.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Digits
{
    public int Multiply(int iNo)
    {
        int iMult = 1, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iMult = iMult + iDigit;
            }
            else
            {
                iMult = iMult * iDigit;
            }
            iNo = iNo / 10;
        }
        return iMult;
    }
}

class program35_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.Multiply(iValue);

        System.out.println("The multiplication of digits is : "+iRet);
    }
}