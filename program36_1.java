///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept N number from the user and accept one another number as NO. Check whether No is present or not.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayDemo
{
    public int Arr[];

    public ArrayDemo(int iSize)
    {
        Arr = new int[iSize];
    }

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
}

class Number extends ArrayDemo
{
    public Number(int iSize)
    {
        super(iSize);
    }

    public boolean Check(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }

        if(iCnt == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program36_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements :");

        int iSize = sobj.nextInt();

        Number nobj = new Number(iSize);

        System.out.println("Enter a number you want to search : ");

        int iValue = sobj.nextInt();

        nobj.Accept();

        boolean bRet = nobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is absent");
        }
    }
}