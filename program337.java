// accept number from user and count number of digits from that number

import java.util.*;

class Digits
{
    public int CountDigits(int iValue)
    {
        int iCount = 0;

        while(iValue != 0)
        {
            iCount++;
            iValue = iValue / 10; 
        } 
        return iCount;      
    }
    
}

class program336
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.CountDigits(iNo);

        System.out.println("Count of digits is : "+iRet);

    }   // End of main
}

// Time complexity : N/2