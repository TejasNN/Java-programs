///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept one array from user and copy the contents of that array into another array and return new array.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int[] CopyArray(int arr[])
    {
        int brr[] = new int[arr.length];

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            brr[iCnt] = arr[iCnt];
        }
        return brr;   
    }
}

class program43_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements array : ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        MyArray mobj = new MyArray();

        int crr[] = mobj.CopyArray(Arr);

        System.out.println("The reversed array is : "+(Arrays.toString(crr)));
    }
}