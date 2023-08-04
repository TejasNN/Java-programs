// Accept string from user and return string without white space
// new approch

import java.util.*;

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        return str.replaceAll("\\s","");
    }  
}

class program362
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

// use string buffer for faster operation as it is mutable and it doesn't create multiple strings