// Accept array from user and return summation of the elements of that aray
// Approch 2

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
        System.out.println();
    }

    public int Summation()
    {
        int iSum = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class program346
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");

        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();
        aobj.Display();

        System.out.println("Summation of all elements : "+aobj.Summation());
    }
}