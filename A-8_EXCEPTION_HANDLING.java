import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception
{
    int num1 , num2 ;
    Exception(int a, int b)
    {
        num1=a;
        num2=b;
    }
    public static void main(String[] args)
    {
        int a,b,flag=1;
        do
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number 1 > > > ");
                a=sc.nextInt();
                System.out.println("Enter Number 2 > > > ");
                b=sc.nextInt();
                Exception obj = new Exception(a,b);
                System.out.println("The Division of Num1 and Num2 is > > > "+ (obj.num1/obj.num2));
                flag=0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception Error ");
                flag=1;
            }
            catch(InputMismatchException e)
            {
                System.out.println("InputMismatch Exception Error ");
                flag=1;
            }
            catch(RuntimeException e)
            {
                System.out.println(e);
                flag=1;
            }
            finally
            {
                if(flag==1)
                {
                    System.out.println("Please Enter Value Again !!!");
                }
            }
        }while(flag!=0);
    }
}
