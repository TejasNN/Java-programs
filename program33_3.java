///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and return difference between frequency of small characters and capital characters.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public int CountDiff(String str)
    {
        char Arr[] = str.toCharArray();

        int iSmall = 0, iCapital = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] < 'z'))
            {
                iSmall++;
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] < 'Z'))
            {
                iCapital++;
            }
        }
        return iSmall - iCapital;
    }
}


class program33_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String name = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountDiff(name);

        System.out.println("The difference between small and capital letters is : "+iRet);
    }
}


