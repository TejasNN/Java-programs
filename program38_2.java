////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept number of rows and number of columns from user and display below pattern.
//
//                      Input :     iRow = 4        iCol = 4
//
//                      Output :    A   B   C   D
//                                  a   b   c   d
//                                  A   B   C   D
//                                  a   b   c   d
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            char ch1 = 'A', ch2 = 'a';
            for(int j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }     
            }
            System.out.println();
            System.out.println();
        }
    }
}

class program38_2
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