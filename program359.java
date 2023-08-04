// Accept string from user and return updated string by converting small letters to capital and capital to small in that string

import java.util.*;

class StringX
{
    public String StrLower(String str)
    {
        // Step 1 : Convert String into array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operations on array
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] < 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3 : Convert array back to string
        return new String(Arr);
    }

    public String StrUpper(String str)
    {
        // Step 1 : Convert String into array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operations on array
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] < 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        // Step 3 : Convert array back to string
        return new String(Arr);
    }

    public String StrToggle(String str)
    {
        // Step 1 : Convert String into array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operations on array
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] < 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
            else if((Arr[iCnt] >= 'a') && (Arr[iCnt] < 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else
            {
                Arr[iCnt] = Arr[iCnt];
            }
        }

        // Step 3 : Convert array back to string
        return new String(Arr);
    }
}

class program359
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.StrLower(name);
        System.out.println("Converted string is : "+sret);

        sret = obj.StrUpper(name);
        System.out.println("Converted string is : "+sret);

        sret = obj.StrToggle(name);
        System.out.println("Converted string is : "+sret);
    }
}