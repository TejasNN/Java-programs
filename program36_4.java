///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept N number from the user and accept range. Display all elements in that range.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] > iNo1) && (Arr[iCnt] < iNo2))
            {
                System.out.print(Arr[iCnt]+"\t");
            }
        }
    }
}

class program36_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");

        int iSize = sobj.nextInt();

        System.out.println("Start : ");

        int iValue1 = sobj.nextInt();

        System.out.println("End : ");

        int iValue2 = sobj.nextInt();

        Number nobj = new Number(iSize);

        nobj.Accept();

        nobj.Display(iValue1,iValue2);
    }
}