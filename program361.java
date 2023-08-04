// Accept string from user and return string without white space
// new approch

import java.util.*;

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        char Arr[] = str.toCharArray();
        String output = "";

        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                output = output + Arr[iCnt];
            }
        }
        return output;
    }  
}

class program361
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.RemoveWhiteSpace(name);

        System.out.println("Result is : "+sRet);
    }
}