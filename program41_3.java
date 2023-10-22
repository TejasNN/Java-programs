////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display below pattern.
//
//                      Input :     Hello
//
//                      Output :    H   #   #   #   #
//                                  H   e   #   #   #
//                                  H   e   l   #   #
//                                  H   e   l   l   #
//                                  H   e   l   l   o   
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public char Arr[];

    public Pattern(String str)
    {
        Arr = str.toCharArray();
    }

    void Display()
    {
        for(int i = 1; i <= Arr.length; i++)
        {
            for(int j = 1; j <= Arr.length; j++)
            {
                if(i >= j)
                {
                    System.out.print(Arr[j-1]+"\t");
                }
                else
                {
                    System.out.print("#"+"\t");
                }
            }
            System.out.println();    
            System.out.println();    
        }    
    }
}

class program41_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        Pattern pobj = new Pattern(str);

        pobj.Display();
    }
}