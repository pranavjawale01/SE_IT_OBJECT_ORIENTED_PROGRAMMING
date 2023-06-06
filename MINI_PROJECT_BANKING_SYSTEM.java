import java.util.Scanner;

class Bank 
{
    Scanner sc = new Scanner(System.in);
    long mobileNo;
    int age , transaction;
    String name , address , customerId;
    double withdraw =0 , deposit=0 , withdrawalLimit , mainBalance = 0 ;
    
    void CreateAccount()
    {
        try
        {
            System.out.println("Enter Given Information To Create Account ");
            System.out.println("Enter Name > > ");
            name=sc.next();
            System.out.println("Enter Address > > ");
            address=sc.next();
            System.out.println("Enter Mobile Number > > ");
            mobileNo=sc.nextLong();
            System.out.println("Enter Age > > ");
            age=sc.nextInt();
            if(age<=17)
            {
                do
                {
                    System.out.println("Minimum Age should be 18 to create an account.");
                    System.out.println("Please Enter Valid Age > > ");
                    age=sc.nextInt();
                }while(age<17);
            }
            System.out.println("Enter Customer ID > > ");
            customerId=sc.next();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{}
    }
    void MinBalance()
    {
        System.out.println("No Minimum Balance Required ");
    }
    void DisplayAccount()
    {
        System.out.print("\nWelcome " + name + "\nFollowing are Your Account Details " + "\n- Address " + address + "\n- Mobile No " + mobileNo + "\n- Age " + age + "\n- Customer ID " + customerId + "\n- Bank Balance " + mainBalance);
    }
    void Deposit()
    {
        System.out.println("Deposit Money > > ");
        deposit=sc.nextDouble();
        mainBalance += deposit;
        System.out.println("Current Bank Balance is > > " + mainBalance + " Rs");
    }
    void Withdraw()
    {
        System.out.println("Withdraw Money > > ");
        withdraw=sc.nextDouble();
        mainBalance -= withdraw;
        if(mainBalance-withdraw >= 0 )
        {
            System.out.println("You Have Withdraw " + withdraw + " Rs");
            System.out.println("Current Bank Balance is > > " + mainBalance + " Rs");
        }
        else
        {
            System.out.println("Insufficient Bank Balance !!");
        }
    }
    void BankBalance()
    {
        System.out.println("Current Bank Balance is > > " + mainBalance + " Rs");
    }
    void DailyTransaction()
    {
        System.out.println("Enter Daily Transaction Limit > >  ");
        transaction=sc.nextInt();
    }
    void DailWithdrawalLimit()
    {
        System.out.println("Enter Daily Withdrawal Limit ");
        withdrawalLimit=sc.nextInt();
    }
}

class SavingAccount extends Bank
{
    void MinBalance()
    {
        System.out.println("Deposit Minimum of 5000 Rs to Open Saving Account ");
        deposit=sc.nextDouble();
        if(deposit<5000)
        {
            do
            {
                System.out.println("Please Deposit Min 5000 Rs to Your Account ");
                deposit=sc.nextDouble();
            }while(deposit<5000);
        }
        mainBalance += deposit;
    }
    void Withdraw()
    {
        System.out.println("Withdraw Money > > ");
        withdraw=sc.nextDouble();
        
        if(mainBalance-withdraw > 5000 )
        {
            mainBalance -= withdraw;
            System.out.println("You Have Withdraw " + withdraw + " Rs");
            System.out.println("Current Bank Balance is > > " + mainBalance + " Rs");
        }
        else
        {
            System.out.println("Insufficient Bank Balance !!");
        }
    }
}

class CurrentAccount extends Bank
{
    void MinBalance()
    {
        System.out.println("Deposit Minimum of 20000 Rs to Open Current Account ");
        deposit=sc.nextDouble();
        if(deposit<20000)
        {
            do
            {
                System.out.println("Please Deposit Min 20000 Rs to Your Account ");
                deposit=sc.nextDouble();
            }while(deposit<20000);
        }
        mainBalance += deposit;
    }
    void Withdraw()
    {
        System.out.println("Withdraw Money > > ");
        withdraw=sc.nextDouble();
        if(mainBalance-withdraw > 20000 )
        {
            mainBalance -= withdraw;
            System.out.println("You Have Withdraw " + withdraw + " Rs");
            System.out.println("Current Bank Balance is > > " + mainBalance + " Rs");
        }
        else
        {
            System.out.println("Insufficient Bank Balance !!");
        }
    }
    void DailyTransaction()
    {
        System.out.println("Unlimited Transaction");
    }
}

class SalaryAccount extends Bank
{
    void DailyTransaction()
    {
        System.out.println("Daily Transaction Limit is 25");
    }
}

public class Banking
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ch , ch1 , ch2 , ch3 ;
        SavingAccount obj1 = new SavingAccount();
        CurrentAccount obj2 = new CurrentAccount();  
        SalaryAccount obj3 = new SalaryAccount();
          
        System.out.println("Which Type of Account You Want Open !");
        System.out.println("\n1.Saving Account \n2.Current Account \n3.Salary Account");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("\n******MENU******");
                do
                {
                    System.out.println("\n1.Create Account \n2.Display Account \n3.Deposit Money \n4.Withdraw Money \n5.Check the Balance \n6.Daily Transaction Limit  \n7.Daily Withdrawal Limit \n8.Exit");
                    ch1=sc.nextInt();
                    switch(ch1)
                    {
                        case 1:
                            obj1.CreateAccount();
                            obj1.MinBalance();
                            break;
                        case 2:
                            obj1.DisplayAccount();
                            break;
                        case 3:
                            obj1.Deposit();
                            break;
                        case 4:
                            obj1.Withdraw();
                            break;
                        case 5:
                            obj1.BankBalance();
                            break;
                        case 6:
                            obj1.DailyTransaction();
                            break;       
                        case 7:
                            obj1.DailWithdrawalLimit();         
                    }
                }while(ch1!=8);

            case 2:
                System.out.println("\n******MENU******");
                do
                {
                    System.out.println("\n1.Create Account \n2.Display Account \n3.Deposit Money \n4.Withdraw Money \n5.Check the Balance \n6.Daily Transaction Limit  \n7.Daily Withdrawal Limit \n8.Exit");
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                        case 1:
                            obj2.CreateAccount();
                            obj2.MinBalance();
                            break;
                        case 2:
                            obj2.DisplayAccount();
                            break;
                        case 3:
                            obj2.Deposit();
                            break;
                        case 4:
                            obj2.Withdraw();
                            break;
                        case 5:
                            obj2.BankBalance();
                            break;
                        case 6:
                            obj2.DailyTransaction();
                            break;       
                        case 7:
                            obj2.DailWithdrawalLimit();         
                    }
                }while(ch2!=8);

            case 3:
                System.out.println("\n******MENU******");
                do
                {
                    System.out.println("\n1.Create Account \n2.Display Account \n3.Deposit Money \n4.Withdraw Money \n5.Check the Balance \n6.Daily Transaction Limit \n7.Daily Withdrawal Limit \n8.Exit");
                    ch3=sc.nextInt();
                    switch(ch3)
                    {
                        case 1:
                            obj3.CreateAccount();
                            obj3.MinBalance();
                            break;
                        case 2:
                            obj3.DisplayAccount();
                            break;
                        case 3:
                            obj3.Deposit();
                            break;
                        case 4:
                            obj3.Withdraw();
                            break;
                        case 5:
                            obj3.BankBalance();
                            break;
                        case 6:
                            obj3.DailyTransaction();
                            break;       
                        case 7:
                            obj3.DailWithdrawalLimit();         
                    }
                }while(ch3!=8);
        }             
    }
}