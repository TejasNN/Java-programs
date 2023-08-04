// Accept string from user and display 

import java.util.Scanner;

class program381
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
    
        for(int iCnt = arr.length -1; iCnt >= 0; iCnt--)
        {
            StringBuffer sb = new StringBuffer(arr[iCnt]);
            output.append(sb.append(" "));
        }
        output = output.trim();
        System.out.println(output);
    }
}