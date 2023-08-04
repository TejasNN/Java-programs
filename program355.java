// Accept string from user and count small letters in that string

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt) <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountCapital(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program355
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = sobj.nextLine();

        StringX obj = new StringX();

        int iRet = obj.CountSmall(name);
        System.out.println("The count of small characters are : "+iRet);

        iRet = obj.CountCapital(name);
        System.out.println("The count of small characters are : "+iRet);
    }
}