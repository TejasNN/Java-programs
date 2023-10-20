////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number of rows and number of columns from user and display below pattern.
//
//                      Input :     iRow = 3        iCol = 4
//
//                      Output :    A   A   A   A
//                                  B   B   B   B
//                                  C   C   C   C
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        char ch = 'A';

        for(int i = 1; i <= iRow; i++,ch++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }

            System.out.println();
            System.out.println();
        }
    }
}

class program38_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Pattern(iRow,iCol);
    }
}