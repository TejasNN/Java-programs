////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept array of characters and one character from user and return occurance of that character without considering it's case.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int Search(char arr[], char ch)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if((arr[iCnt] == ch) || (arr[iCnt] == ch + 32) || (arr[iCnt] == ch - 32))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program44_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        System.out.println("Enter a character to search : ");
        char ch = sobj.next().charAt(0);

        MyArray mobj = new MyArray();

        int iRet = mobj.Search(arr,ch);

        System.out.println("The character "+ch+" occured "+iRet+" times");
    }
}

