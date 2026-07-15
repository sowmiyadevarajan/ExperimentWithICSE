 import java.util.*;

    class Salary
    {
        String name,add,sub;
        long ph;
        double sal,tax;

        void accept()
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter name:");
            name=in.nextLine();
            System.out.println("Enter address:");
            add=in.next();
            System.out.println("Enter Phone Number:");
            ph=in.nextLong();
            System.out.println("Enter Subject Specialisation:");
            sub=in.next();
            System.out.println("Enter Monthly Salary:");
            sal=in.nextDouble();
        }

        void calculate()
        {
            if(12*sal>175000)
                tax=((sal*12)-175000)*5/100;
            else
                tax=0;
        }

        void display()
        {
            System.out.println("Name :"+name);
            System.out.println("Address :"+add);
            System.out.println("Phone Number :"+ph);
            System.out.println("Subject Specialisation :"+sub);
            System.out.println("Monthly Salary :Rs "+sal);
            System.out.println("Income Tax :Rs "+tax);
        }

        public static void main(String args[])
        {
            Salary ob=new Salary();
            ob.accept();
            ob.calculate();
            ob.display();
        }
    }

   