// Doubly Linear linked list

import java.util.*;

class Node
{
    public int data;
    public Node next;
    public Node prev;

    public Node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    public Node first;
    public int iCount;

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        System.out.println("Elements of Doubly linear linked list are : ");

        Node temp = first;

        System.out.print("null <=> ");
        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void DisplayReverse()
    {
        System.out.println("Elements of Doubly linear linked list in reverse order are : ");

        Node temp = first;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        System.out.print("null <=> ");
        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return this.iCount;
    }
    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;
        }
        iCount++;
    }

    public void InsertAtPos(int no, int iPos)
    {
        Node temp = first;

        if((iPos < 1) || (iPos > iCount+1))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(no);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            Node newn = new Node(no);

            for(int iCnt = 1; iCnt < iPos - 1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;
            newn.prev = temp;
            temp.next = newn;
        
            iCount++;
        }
        
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first.next = null;
        }
        else
        {
            first = first.next;
            first.prev = null;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        Node temp = first;

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }

        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        Node temp = first;

        if((iPos < 1) || (iPos > iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            for(int iCnt = 1; iCnt < iPos - 1; iCnt++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            iCount--;
        } 
    }
}

class program456
{
    public static void main(String arg[])
    {
        DoublyLL obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.InsertAtPos(55,4);

        obj.Display();
        obj.DisplayReverse();

        System.out.println("Number of elements are : "+obj.Count());

        obj.DeleteFirst();
        obj.DeleteLast();

        obj.Display();
        obj.DisplayReverse();

        System.out.println("Number of elements are : "+obj.Count());

        obj.DeleteAtPos(4);

        obj.Display();
        obj.DisplayReverse();
        
        System.out.println("Number of elements are : "+obj.Count());
    }   
}