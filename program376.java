// Accept string from user and return the largest word in it with its length by taking that word from user

import java.util.Scanner;

class program376
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");   // remove white spaces if they are more than 1 and keep them as is if only 1
        str = str.trim();                   // will remove the white spaces before and after the string if any

        String arr[] = str.split(" ");
        
        int iMax = 0;
        int iPos = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt].length() > iMax)
            {
                iMax = arr[iCnt].length();
                iPos = iCnt;
            }
        }

        System.out.println("Largest word is : "+arr[iPos]+" with length : "+iMax);
    }
}