import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,i,flag=0;
        System.out.println("Enter The Number to Check it is Prime or Not : ");
        a=sc.nextInt();
        for(i=2; i<a ; ++i)
        {
            if(a%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The Number "+ a +" is Prime !");
        }
        else
        {
        	System.out.println("The Number "+ a +" is Not Prime !");   
        }
    }
}
