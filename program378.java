// Accept string from user and return the reversed string where the words in that string will be reversed // position same, words reversed

import java.util.Scanner;

class program378
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");   // remove white spaces if they are more than 1 and keep them as is if only 1
        str = str.trim();                   // will remove the white spaces before and after the string if any

        String arr[] = str.split(" ");

        StringBuffer output = new StringBuffer();
    
        for(String s : arr)
        {
            StringBuffer word = new StringBuffer(s);

            output.append((word.reverse()).append(" "));
        }

        System.out.println("Result is : "+output);
    }
}