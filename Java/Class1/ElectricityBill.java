  import java.util.*;

    class ElectricityBill
    {
        String name;
        int ut;
        double amt=0.0,scg=0.0;
        Scanner in=new Scanner(System.in);

        void accept()
        {
            System.out.println("Enter name of the consumer:");
            name=in.nextLine();
            System.out.println("Enter units consumed:");
            ut=in.nextInt();
        }

        void calculate()
        {
            if(ut<=100)
                amt=ut*2.0;
            if(ut>100 && ut<=300)
                amt=200+(ut-100)*3.0;
            if(ut>300)
            {
                scg=ut*2.5/100.0;
                amt=scg+(200+600+(ut-300)*5.0);
            }
        }

        void print()
        {
            System.out.println("Name of the customer :"+name);
            System.out.println("Number of units consumed :"+ut);
            System.out.println("Bill Amount :Rs "+amt);
        }

        public static void main(String args[])
        {
            ElectricityBill ob=new ElectricityBill();
            ob.accept();
            ob.calculate();
            ob.print();
        }
    }