////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two strings from the user and concat N character of second string after first string.
//                      Value of N should be accepted from user. Note - If third parameter is greater than the size of second string then 
//                      concat whole string after first string.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    char Crr[] = new char[50];

    public String StrNCatX(String src, String dest, int iNo)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = dest.toCharArray();

        int iCount = 0;

        for(iCount = 0; iCount < Arr.length; iCount++)
        {
            Crr[iCount] = Arr[iCount];    
        }

        Crr[iCount] = ' ';
        iCount++;

        if(iNo < Brr.length)
        {
            for(int iCnt = 0; iCnt < iNo; iCnt++, iCount++)
            {
                Crr[iCount] = Brr[iCnt];
            }
        }
        else if(iNo > Brr.length)
        {
            for(int iCnt = 0; iCnt < Brr.length; iCnt++, iCount++)
            {
                Crr[iCount] = Brr[iCnt];
            }
        }
        
        return new String(Crr);
    }
}

class program37_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");

        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");

        String str2 = sobj.nextLine();

        System.out.println("Enter number of characters of second string to concat : ");

        int iValue = sobj.nextInt();

        StringDemo obj = new StringDemo();

        String sRet = obj.StrNCatX(str1,str2,iValue);

        System.out.println("The updated string is : "+sRet);

    }
}