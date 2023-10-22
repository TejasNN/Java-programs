////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display below pattern.
//
//                      Input :     Hello
//
//                      Output :
//                                  H   
//                                  H   e   
//                                  H   e   l
//                                  H   e   l   l 
//                                  H   e   l   l   o 
//                                  H   e   l   l     
//                                  H   e   l     
//                                  H   e   
//                                  H   
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
            for(int j = 0; j < i ; j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();    
            System.out.println();    
        }

        for(int i = (Arr.length-1); i >= 1; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();
            System.out.println();
        }    
    }
}

class program40_5
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