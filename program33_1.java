////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and count number of capital letters.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] < 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}


class program33_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String name = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountCapital(name);

        System.out.println("The number of capital letters are : "+iRet);
    }
}


