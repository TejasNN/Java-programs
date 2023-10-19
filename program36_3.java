/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept N number from the user and accept one another number as NO. Return index of last occurence of that number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public int LastOcc(int iNo)
    {
        int iCnt = 0, iPos = -1;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iPos = iCnt;
            }
        }
        return iPos;
    }
}

class program36_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");

        int iSize = sobj.nextInt();

        System.out.println("Enter a number : ");

        int iValue = sobj.nextInt();

        Number nobj = new Number(iSize);

        nobj.Accept();

        int iRet = nobj.LastOcc(iValue);

        if(iRet == -1)
        {
            System.out.println(iRet);
        }
        else
        {
            System.out.println("The number "+iValue+" occured last at "+iRet+" position");
        }
    }
}