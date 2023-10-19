///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two strings from the user and check whether the contents of both strings are equal or not.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public boolean StrCmpX(String src, String dest)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = dest.toCharArray();
        
        int iCnt = 0;

        if(Arr.length != Brr.length)
        {
            return false;
        }

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != Brr[iCnt])
            {
                break;
            }   
        }
        if(iCnt == Arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program37_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");

        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");

        String str2 = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrCmpX(str1,str2);

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