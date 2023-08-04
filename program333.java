// accept number from user and return multipication of even factors of that number
// Best optimisation

import java.util.*;

class Numbers
{
    public int EvenFact(int iValue)
    {
        int iMult = 1;

        for(int iCnt = 2; iCnt <= iValue; iCnt = iCnt+2)
        {
            if((iValue % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

class program333
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();
        
        int iRet = nobj.EvenFact(iNo);

        System.out.println("Multiplication of even factors is : "+iRet);

    }   // End of main
}

// Time complexity : N/2