///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept a string from the user and check whether the string is pallindrome or nor without considering its case.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public boolean StrPallindrome(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iStart = 0;
        int iEnd = Arr.length - 1;

        while(iStart < iEnd)
        {
            if((Arr[iStart] == Arr[iEnd]) || ((Arr[iStart] + 32) == Arr[iEnd]) || ((Arr[iStart] - 32) == Arr[iEnd]) || (Arr[iStart] == Arr[iEnd] + 32) || (Arr[iStart] == Arr[iEnd] - 32))
            {
                
            }
            else
            {
                break;
            }

            iStart++;
            iEnd--;
        }

        if(iStart < iEnd)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program37_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrPallindrome(str);

        if(bRet == true)
        {
            System.out.println("String is pallindrome.");
        }
        else
        {
            System.out.println("String is not a pallindrome.");
        }
    }
}