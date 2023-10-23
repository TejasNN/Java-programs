//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept two arrays from user and form new array which is combination of first and second array.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int[] ArrayConcate(int arr1[], int iSize1, int arr2[], int iSize2)
    {
        int arr3[] = new int[iSize1+iSize2];
        int iCount = 0;

        for(int iCnt = 0; iCnt < arr1.length; iCnt++,iCount++)
        {
            arr3[iCount] = arr1[iCnt];
        }
        
        for(int iCnt = 0; iCnt < arr2.length; iCnt++,iCount++)
        {
            arr3[iCount] = arr2[iCnt];
        }
        return arr3;
    }
}

class program42_4
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

        int Crr[] = mobj.ArrayConcate(Arr,iSize1,Brr,iSize2);

        System.out.println("The concated array is : "+(Arrays.toString(Crr)));
    }
}