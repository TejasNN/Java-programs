////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two arrays from user and return difference between summation of arrays.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int DiffArray(int arr1[], int arr2[])
    {
        int iSum1 = 0, iSum2 = 0;

        for(int iCnt = 0; iCnt < arr1.length; iCnt++)
        {
            iSum1 = iSum1 + arr1[iCnt];
        }

        for(int iCnt = 0; iCnt < arr2.length; iCnt++)
        {
            iSum2 = iSum2 + arr2[iCnt];
        }
        return iSum1 - iSum2;
    }
}

class program43_1
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

        int iRet = mobj.DiffArray(Arr,Brr);

        System.out.println("The difference between summation of both arrays is : "+iRet);
    }
}