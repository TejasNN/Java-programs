// accept number from user and return additon of digits from that number

import java.util.*;

class Digits
{
    public int DigitAddition(int iValue)
    {
        int iDigit = 0, iSum = 0;

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iSum = iSum + iDigit;
            iValue = iValue / 10; 
        } 
        return iSum;      
    }
    
} // End of class Digits

class program338
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