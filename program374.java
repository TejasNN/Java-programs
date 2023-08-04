// Accept string from user and return the count specific word in it 

import java.util.Scanner;

class program374
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");   // remove white spaces if they are more than 1 and keep them as is if only 1
        str = str.trim();                   // will remove the white spaces before and after the string if any

        String Arr[] = str.split(" ");
        int iFrequency = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt].equals("india"))
            {
                iFrequency++;
            }
        }
        System.out.println("The count of India is : "+iFrequency);
    }
}