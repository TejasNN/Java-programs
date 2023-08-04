// Accept string from user and remove white spaces if more than one //with white space logic 

import java.util.Scanner;

class program369
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");   // remove white spaces which are more than 1

        str = str.trim();       // will remove the white spaces before and after the string if any

        System.out.println("Updated string is : "+str);
    }
}