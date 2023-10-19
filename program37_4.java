///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																			                                           
//	Problem statement :	Write a java program which accept a string from the user and reverse the contents of the string by toggling the case.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo
{
    public String StrRevTogX(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iStart = 0;
        int iEnd = Arr.length - 1;
        char cTemp = ' ';

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];

            if((cTemp >= 'a') && (cTemp < 'z'))
            {
                cTemp = (char)(cTemp - 32);
            }
            else if((cTemp >= 'A') && (cTemp < 'Z'))
            {
                cTemp = (char)(cTemp + 32);
            }

            Arr[iEnd] = cTemp;
            
            if((Arr[iStart] >= 'a') && (Arr[iStart] < 'z'))
            {
                Arr[iStart] = (char) (Arr[iStart] - 32);
            }
            else if((Arr[iStart] >= 'A') && (Arr[iStart] < 'Z'))
            {
                Arr[iStart] = (char) (Arr[iStart] + 32);
            }

            iStart++;
            iEnd--;
        }
        return new String(Arr);
    }
}

class program37_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        String sRet = obj.StrRevTogX(str);

        System.out.println("The reverse toggled string is : "+sRet);
    }
}