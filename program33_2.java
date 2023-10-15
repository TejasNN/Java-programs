////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and count number of small letters.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] < 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}


class program33_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String name = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountSmall(name);

        System.out.println("The number of small letters are : "+iRet);
    }
}


