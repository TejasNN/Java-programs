// Accept string from user and return the count of words in it by using split() function

import java.util.Scanner;

class program372
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");   // remove white spaces if they are more than 1 and keep them as is if only 1
        str = str.trim();                   // will remove the white spaces before and after the string if any

        String Arr[] = str.split(" ");
        System.out.println("Number of words are : "+Arr.length);
    }
}