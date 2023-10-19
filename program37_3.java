///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two strings from the user and check whether first N contents of two strings are equal or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public boolean StrNCmpX(String src, String dest, int iNo)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = dest.toCharArray();
        
        int iCnt = 0;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            if(Arr[iCnt] != Brr[iCnt])
            {
                break;
            }   
        }
        if((iCnt == iNo))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program37_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");

        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");

        String str2 = sobj.nextLine();

        System.out.println("Enter a number to match strings : ");

        int iValue = sobj.nextInt();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrNCmpX(str1,str2,iValue);

        if(bRet == true)
        {
            System.out.println("Both string are equal");
        }
        else
        {
            System.out.println("Both string are different");
        }
    }
}