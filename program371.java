// Accept string from user and return the count of words in it 

import java.util.Scanner;

class program371
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();
        
        if(str.length() == 0)
        {
            System.out.println("Number of words are : 0");
            return;
        }

        str = str.replaceAll("\\s+"," ");   // remove white spaces which are more than 1
        str = str.trim();                   // will remove the white spaces before and after the string if any

        int iFrequency = 0;
        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ' ')
            {
                iFrequency++;
            }
        }

        System.out.println("Number of words are : "+(iFrequency + 1));
    }
}