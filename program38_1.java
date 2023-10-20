////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number of rows and number of columns from user and display below pattern.
//
//                      Input :     iRow = 4        iCol = 4
//
//                      Output :    A   B   C   D
//                                  A   B   C   D
//                                  A   B   C   D
//                                  A   B   C   D
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            char ch = 'A';
            for(int j = 1; j <= iCol; j++,ch++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}

class program38_1
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