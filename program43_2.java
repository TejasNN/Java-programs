///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two arrays from user and display minimum element of each array.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public void MinArray(int arr1[], int arr2[])
    {
        int iMin1 = arr1[0], iMin2 = arr2[0];

        for(int iCnt = 0; iCnt < arr1.length; iCnt++)
        {
            if(arr1[iCnt] < iMin1)
            {
                iMin1 = arr1[iCnt];
            }
        }
        System.out.println("Minimum element of first array is : "+iMin1);

        for(int iCnt = 0; iCnt < arr2.length; iCnt++)
        {
            if(arr2[iCnt] < iMin2)
            {
                iMin2 = arr2[iCnt];
            }
        }
        System.out.println("Minimum element of second array is : "+iMin2);
    }
}

class program43_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements for first array : ");
        int iSize1 = sobj.nextInt();

        int iCnt = 0;

        int Arr[] = new int[iSize1];

        System.out.println("Enter the elements for first array : ");

        for(iCnt = 0; iCnt < iSize1; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number of elements for second array : ");
        int iSize2 = sobj.nextInt();

        int Brr[] = new int[iSize2];

        System.out.println("Enter the elements for second array : ");

        for(iCnt = 0; iCnt < iSize2; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        MyArray mobj = new MyArray();

        mobj.MinArray(Arr,Brr);
    }
}