////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number of rows and number of columns from user and display below pattern.
//
//                      Input :     iRow = 3        iCol = 5
//
//                      Output :    5   4   3   2   1
//                                  5   4   3   2   1
//                                  5   4   3   2   1  
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }

            System.out.println();
            System.out.println();
        }
    }
}

class program39_3
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