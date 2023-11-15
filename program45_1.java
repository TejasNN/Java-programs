////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display below pattern.
//
//                      Input :     iRow = 4        iCol = 4
//
//                      Output :    *   *   *   #
//                                  *   *   #   *
//                                  *   #   *   *
//                                  #   *   *   *  
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
            for(int j = iCol; j >= 1; j--)
            {
                if(i == j)
                {
                    System.out.print("#"+"\t");
                }
                else
                {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}

class program45_1
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