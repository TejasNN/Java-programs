////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept array of characters and return count of vowels in it.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int ArrayCountVowels(char arr[])
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if((arr[iCnt] == 'a') || (arr[iCnt] == 'e') || (arr[iCnt] == 'i') || (arr[iCnt] == 'o') || (arr[iCnt] == 'u') || (arr[iCnt] == 'A') || (arr[iCnt] == 'E') || (arr[iCnt] == 'I') || (arr[iCnt] == 'O') || (arr[iCnt] == 'U'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program44_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        MyArray mobj = new MyArray();

        int iRet = mobj.ArrayCountVowels(arr);

        System.out.println("The count of vowels in this character array is : "+iRet);
    }
}

