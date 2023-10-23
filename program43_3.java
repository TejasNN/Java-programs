//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept one array from user and copy the contents of that array into another array in reverse order and return new array.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public int[] CopyArrayReverse(int arr[])
    {
        int iCount = 0;
        int brr[] = new int[arr.length];

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iCount++;
        }
        iCount--;
        for(int iCnt = 0; iCnt < arr.length; iCnt++,iCount--)
        {
            brr[iCnt] = arr[iCount];
        }
        return brr;   
    }
}

class program43_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        MyArray mobj = new MyArray();

        int crr[] = mobj.CopyArrayReverse(Arr);

        System.out.println("The reversed array is : "+(Arrays.toString(crr)));
    }
}