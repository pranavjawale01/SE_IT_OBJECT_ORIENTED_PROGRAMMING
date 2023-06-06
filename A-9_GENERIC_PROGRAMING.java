import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Generic <T>
{
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<String>  a2 = new ArrayList<String>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> prime = new ArrayList<Integer>();
    ArrayList<String>  palindrome = new ArrayList<String>();

    int x, oddCount=0, evenCount=0, primeCount=0, palindromeCount=0;
    
    void input()
    {
        int a;
        String b;
        System.out.println("Enter the SIZE of Array ");
        x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            System.out.println("Enter The Element "+ (i+1) +" > > > ");
            try 
            {
                a=sc.nextInt();
                a1.add(a);
            }
            catch(RuntimeException e) 
            {
                b=sc.next();
                a2.add(b);
            }
        }
    }

    void counter()
    {
        Iterator<Integer> it1 = a1.iterator();
        Iterator<String>  it2 = a2.iterator();
        while(it1.hasNext())
        {
            int a=it1.next();
            //PRIME
            int flag=0;
            if(a==1 || a==0)
            {
                flag=1;
            }
            if(a==2 || a==3)
            {
                flag=0;
            }
            else
            {
                for(int i = 2; i < a1.size() ; i++)
                {
                    if(a%i==0) 
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0) 
            {
                prime.add(a);
                primeCount++;
            }

            //EVEN
            if(a%2==0)
            {
                even.add(a);
                evenCount++;
            }
            //ODD
            else
            {
                odd.add(a);
                oddCount++;
            }
        } 
        while(it2.hasNext())
        {
            //PALINDROME
            String s=it2.next();
            boolean ans = false;
            String rev="";
            for(int i=s.length()-1; i>=0; i--)
            {
                rev = rev + s.charAt(i);
            }
            if(s.equals(rev)) 
            {
                ans = true;
            }
            if(ans == true)
            {
                palindrome.add(s);
                palindromeCount++;
            }
        }   
        System.out.println("Even Count > > " + evenCount + " > > "+ even);
        System.out.println("Odd Count > > " + oddCount + " > > " + odd);
        System.out.println("Prime Count > > " + primeCount + " > > " + prime );
        System.out.println("Palinderome Count > > " + palindromeCount + " > >" + palindrome);
    }
    public static void main(String[] args)
    {
        Generic obj = new Generic();
        obj.input();
        obj.counter();
    }
}
