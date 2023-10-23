///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept one array from user and check whether that array and it's elements are pallindrome or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray
{
    public boolean ChkPallindrome(int arr[])
    {
        int iStart = 0;
		int iEnd = arr.length-1;
        int brr[] = new int[10];
		while(iStart < iEnd)
		{
            int iReverse = 0, iDigit = 0;
            int iTemp = arr[iStart];
            while(iTemp != 0)	
            {
                iDigit = iTemp % 10;
                iReverse = iDigit + (iReverse * 10);
                brr[iStart] = iReverse;
                iTemp = iTemp / 10;
            }
            if((arr[iStart] != iReverse) || (iReverse != arr[iEnd]))
            {
                break;
            }
            
            iStart++;
			iEnd--;
        }
        System.out.println(Arrays.toString(brr));
        if(iStart == iEnd)
        {
            int iReverse = 0, iDigit = 0;
            int iTemp = arr[iStart];
            while(iTemp != 0)	
            {
                iDigit = iTemp % 10;
                iReverse = iDigit + (iReverse * 10);
                brr[iStart] = iReverse;
                iTemp = iTemp / 10;
            }
            if(iReverse != arr[iStart])
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}          

class program43_5
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

        boolean bRet = mobj.ChkPallindrome(Arr);

        if(bRet == true)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not a pallindrome");
        }
    }
}