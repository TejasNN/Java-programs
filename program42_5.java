////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two arrays from user and return display odd contents of each array.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public void SumArray(int arr1[], int arr2[])
    {
        int iSum = 0;

        System.out.println("Elements of first array are : ");
        for(int iCnt = 0; iCnt < arr1.length; iCnt++)
        {
            iSum = iSum + arr1[iCnt];
        }
        System.out.println(iSum);

        iSum = 0;

        System.out.println("Elements of second array are : ");
        for(int iCnt = 0; iCnt < arr2.length; iCnt++)
        {
            iSum = iSum + arr2[iCnt];
        }
        System.out.println(iSum);
    }
}

class program42_5
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

        mobj.SumArray(Arr,Brr);
    }
}