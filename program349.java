// Accept string from user and display the string

import java.util.*;

class program349
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = sobj.nextLine();

        System.out.println("Your name is : "+name);
    }
}