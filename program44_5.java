/////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept array from user and display below pattern.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public void Pattern(int arr[])
    {
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if((arr[iCnt] % 2) == 0)
            {
                for(int iCount = 0; iCount < arr[iCnt]; iCount++)
                {
                    System.out.print("*"+"\t");
                }
                System.out.println();
            }
        }
    }
}

class program44_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        MyArray mobj = new MyArray();

        mobj.Pattern(Arr);
    }
}

