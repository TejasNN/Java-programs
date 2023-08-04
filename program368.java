// Accept string from user and remove white spaces if more than one //with white space logic 

import java.util.Scanner;

class program368
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");

        System.out.println("Updated string is : "+str);
    }
}