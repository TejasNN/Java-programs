/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept array of characters from user and replace each capital character with it's corresponding small character.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public void ArrayReplace(char arr[])
    {
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if((arr[iCnt] >= 'A') && (arr[iCnt] <= 'Z'))
            {
                arr[iCnt] = (char)(arr[iCnt] + 32);
            }
            System.out.print(arr[iCnt]+"\t");
        }
    }
}

class program44_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        MyArray mobj = new MyArray();

        mobj.ArrayReplace(arr);
    }
}

