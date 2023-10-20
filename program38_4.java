////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number of rows and number of columns from user and display below pattern.
//
//                      Input :     iRow = 4        iCol = 5
//
//                      Output :    4   4   4   4   4
//                                  3   3   3   3   3
//                                  2   2   2   2   2
//                                  1   1   1   1   1
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }

            System.out.println();
            System.out.println();
        }
    }
}

class program38_4
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