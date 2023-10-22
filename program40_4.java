////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept string from user and display below pattern.
//
//                      Input :     Hello
//
//                      Output :
//                                  H   e   l   l   o
//                                  H   e   l   l   
//                                  H   e   l
//                                  H   e     
//                                  H    
//                                  H   e     
//                                  H   e   l   
//                                  H   e   l   l
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
        for(int i = Arr.length; i >= 1; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
        
        for(int i = 2; i <= Arr.length; i++)
        {
            for(int j = 0; j < i ; j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();    
            System.out.println();    
        }
        
    }
}

class program40_4
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