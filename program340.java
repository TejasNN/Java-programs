// accept number from user and return generic root(sum of digit should be less than 10, loop until then                                                                                   )
// input : 987898   Output : 4

import java.util.*;

class Digits
{
    public int GenericRoot(int iNo)
    {
        int iSum = 0, iDigit = 0;

        while(iNo >= 10)
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
            if(iSum >= 10)
            {
                iNo = iSum;
                iSum = 0;
            }
            else
            {
                iNo = iSum;
                break;
            }
        }
        return iNo;
    }
    
} // End of class Digits

class program340
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.GenericRoot(iNo);

        System.out.println("Generic root is : "+iRet);

    }   // End of main
}

// Time complexity : N/2