import java.util.*;

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int X, int Y)
    {
        this.Rno = ++Generator;
        this.Name = str;
        this.Age = X;
        this.Marks = Y;
    }

    public void Display()
    {
        System.out.println(this.Rno + " "+ this.Name + " "+ this.Age + " " + this.Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList <Student> ();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous DBMS started successfully...");
        System.out.println("Table schema created successfully...");

        String Query;
        String Tokens[];

        Scanner sobj = new Scanner(System.in);
        int TokensCount = 0;

        while(true)
        {
            System.out.print("Marvellous DBMS > ");
            Query = sobj.nextLine();

            Tokens = Query.split(" ");

            TokensCount = Tokens.length;

            if(TokensCount == 1)            // This is query parsing
            {
                if("exit".equals(Tokens[0]))
                {
                    System.out.println("Thank you for using Marvellous DBMS...");
                    break;
                }
            }
            else if(TokensCount == 2)
            {

            }
            else if(TokensCount == 3)
            {
                
            }
            else if(TokensCount == 4)
            {
                
            }
            else if(TokensCount == 5)
            {
                
            }
            else if(TokensCount == 6)
            {
                
            }
            else if(TokensCount == 7)
            {
                if("insert".equals(Tokens[0]))
                {
                    InsertIntoTable(Tokens[4], Integer.parseInt(Tokens[5]), Integer.parseInt(Tokens[6]));
                }
            }
        }
        
    }

    public void InsertIntoTable(String name, int age, int marks)
    {
        Student sobj = new Student(name,age,marks);

        lobj.add(sobj);
    }

    public void SelectFrom()
    {
        System.out.println("Records from the student table are : ");

        for(Student sref : lobj)
        {
            sref.Display();
        }
    }

    public void SelectFrom(int no)
    {
        System.out.println("Records from the student table are : ");

        for(Student sref : lobj)
        {
            if(sref.Rno == no)
            {
                sref.Display();
                break;
            } 
        }
    }

    public void SelectFrom(String str)
    {
        System.out.println("Records from the student table are : ");

        for(Student sref : lobj)
        {
            if(str.equals(sref.Name))
            {
                sref.Display();
                break;
            } 
        }
    }

    public int Aggregate_Max()
    {
        Student temp = lobj.get(0);
        int iMax = temp.Marks;

        for(Student sref : lobj)
        {
            if(sref.Marks > iMax)
            {
                iMax = sref.Marks;
            } 
        }
        return iMax;

    }

    public int Aggregate_Min()
    {
        Student temp = lobj.get(0);
        int iMin = temp.Marks;

        for(Student sref : lobj)
        {
            if(sref.Marks < iMin)
            {
                iMin = sref.Marks;
            } 
        }
        return iMin;
    }

    public int Aggregate_Sum()
    {
        int iSum = 0;

        for(Student sref : lobj)
        {
            iSum = iSum + sref.Marks;
        }
        return iSum;
    }

    public double Aggregate_Average()
    {
        double iSum = 0.0; 

        for(Student sref : lobj)
        {
            iSum = iSum + sref.Marks;
        }
        return (iSum / (lobj.size()));
    }

    public void DeleteFrom(int no)
    {
        int i = 0;

        for(Student sref : lobj)
        {
            if(sref.Rno == no)
            {
                lobj.remove(i);
                break;
            } 
            i++;
        }
    }
}

class program535
{
    public static void main(String arg[])
    {
        DBMS obj = new DBMS();
        obj.StartDBMS();

        /*
        obj.InsertIntoTable("Rahul",23,89);
        obj.InsertIntoTable("Sagar",26,98);
        obj.InsertIntoTable("Pooja",20,56);
        obj.InsertIntoTable("Sayali",30,78);
        obj.InsertIntoTable("Tejas",29,68);

        obj.SelectFrom();
        obj.SelectFrom(3);
        obj.SelectFrom("Tejas");

        System.out.println("The maximum marks are : "+obj.Aggregate_Max());
        System.out.println("The minimum marks are : "+obj.Aggregate_Min());
        System.out.println("The sum of the marks is : "+obj.Aggregate_Sum());
        System.out.println("The average of the marks is : "+obj.Aggregate_Average());

        obj.DeleteFrom(4);
        obj.SelectFrom();
        */


    }
}