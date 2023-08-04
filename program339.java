// accept number from user and return additon of digits from that number

import java.util.*;

class Digits
{
    public int DigitAddition(int iValue)
    {
        int iSum = 0;
        if(iValue < 0)
        {
            iValue = -iValue;
        }
        
        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue = iValue / 10; 
        } 
        return iSum;      
    }
    
} // End of class Digits

class program339
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.DigitAddition(iNo);

        System.out.println("Summation of digits is : "+iRet);

    }   // End of main
}

// Time complexity : N/2