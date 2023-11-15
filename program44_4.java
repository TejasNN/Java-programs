/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept array of characters and return difference between frequency of capital and small letters.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int Difference(char arr[])
    {
        int iCapital = 0, iSmall = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if((arr[iCnt] >= 'A') && (arr[iCnt] <= 'Z'))
            {
                iCapital++;
            }
            else if((arr[iCnt] >= 'a') && (arr[iCnt] <= 'z'))
            {
                iSmall++;
            }
        }
        return iCapital - iSmall;
    }
}

class program44_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        MyArray mobj = new MyArray();

        int iRet = mobj.Difference(arr);

        System.out.println("The difference between frequency of capital and small letters is :"+iRet);
    }
}

