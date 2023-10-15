///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and check whether it contains vowels in it or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public boolean ChkVowel(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
			if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u') || Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U'))
            {
                break;
            }
        }
        
        if(iCnt != Arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


class program33_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String name = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.ChkVowel(name);

        if(bRet == true)
        {
            System.out.println("Vowels found in input string.");
        }
        else
        {
            System.out.println("No vowels found in input string.");
        }
    }
}


