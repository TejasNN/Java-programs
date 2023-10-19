//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept N number from the user and return product of all odd elements.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public int Product()
    {
        int iMult = 1;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                iMult = iMult * Arr[iCnt];
            }
            else
            {
                iMult = 0;
            }
        }
        return iMult;
    }
}

class program36_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");

        int iSize = sobj.nextInt();

        Number nobj = new Number(iSize);

        nobj.Accept();

        int iRet = nobj.Product();

        System.out.println("The product of odd elements is : "+iRet);
    }
}