////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display below pattern.
//
//                      Input :     iRow = 5       iCol = 5
//
//                      Output :    1   2   3   4   5
//                                  1   2           5
//                                  1       3       5
//                                  1           4   5
//                                  1   2   3   4   5
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            System.out.println("Please enter same values for rows and columns for accurate pattern\n");
            return;
        }

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if((i == j) || (i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}

class program45_5
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