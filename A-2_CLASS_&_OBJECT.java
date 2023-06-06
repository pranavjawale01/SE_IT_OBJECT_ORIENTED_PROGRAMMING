import java.util.Scanner;

public class Complex
{
    float real,img;
    static Scanner sc = new Scanner(System.in);
    Complex(){}

    void getdata()
    {  
        System.out.println("Enter a Complex Number");
        System.out.print("\nEnter Real Part : ");
        real=sc.nextInt();
        System.out.print("\nEnter Img Part : ");
        img=sc.nextInt();
        System.out.printf("Complex Number is %2.2f + %2.2fi\n",real,img);
    }

    Complex add(Complex a , Complex b)
    {
        Complex temp = new Complex();
        temp.real=a.real+b.real;
        temp.img =b.img +a.img;
        return temp;
    }

    Complex sub(Complex a , Complex b)
    {
        Complex temp = new Complex();
        temp.real=a.real-b.real;
        temp.img=a.img-b.img;
        return temp;
    }

    Complex mul(Complex a , Complex b)
    {
        Complex temp = new Complex();
        temp.real=a.real*b.real-a.img*b.img;
        temp.img=a.real*b.img+a.img*b.real;
        return temp;
    }

    Complex div(Complex a , Complex b)
    {
        Complex temp = new Complex();
        temp.real=((a.real*b.real+a.img*b.img)/(b.real*b.real+b.img*b.img));
        temp.img=((b.real*a.img-a.real*b.img)/(b.real*b.real+b.img*b.img));
        return temp;
    }
    public static void main(String[] args)
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.getdata();
        c2.getdata();
        Complex opr = new Complex();
        int ch;
        do
        {
            System.out.println("\n1.Addition \t2.Substraction\t\t 3.Multiplication \t4.Division \t5.Exit");
            System.out.println("Enter The Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    Complex res1;
                    res1=opr.add(c1,c2);
                    	 System.out.printf("\nAddition : %2.2f + %2.2fi",res1.real,res1.img);
                    break;
                case 2:
                    Complex res2;
                    res2=opr.sub(c1,c2);
                    System.out.printf("\nSubstraction : %2.2f + %2.2fi",res2.real,res2.img);
                    break;
                case 3:
                    Complex res3;
                    res3=opr.mul(c1,c2);
                    System.out.printf("\nMultiplication : %2.2f + %2.2fi",res3.real,res3.img);
                    break;
                case 4:
                    Complex res4;
                    res4=opr.div(c1,c2);
                    System.out.printf("\nDivision : %2.2f + %2.2fi",res4.real,res4.img);
                    break;
            }
        }while(ch!=5);
    }
}
