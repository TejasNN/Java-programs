///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display it in reverse order.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length-1;

        char cTemp = ' ';

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        } 

        System.out.println(Arr);       
    }
}


class program33_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String name = sobj.nextLine();

        StringDemo obj = new StringDemo();

        obj.Reverse(name);

    }
}


