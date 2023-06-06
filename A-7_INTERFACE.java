import java.util.Scanner;

interface Vehicle
{
    static Scanner sc = new Scanner(System.in);
    public void GearChange();
    public void SpeedUp();
    public void ApplyBreak();
}

class Bicycle implements Vehicle
{
    int gear=0, speed=0;
    public void GearChange()
    {
        System.out.println("Enter Gear > ");
        gear=sc.nextInt();
        if(gear>0 && gear<4){
            System.out.println("Bicycle Gear Changes Sucessfully \nCurrent Gear is > "+gear);
        }
        else{
            System.out.println("Gear is Out of Range !");
        }
    }
    public void SpeedUp()
    {
        System.out.println("Enter The Speed");
        speed=sc.nextInt();
        if(speed>0 && speed<51){
            System.out.println("Current Speed is > " + speed);
        }
        else{
            System.out.println("Speed Limit Reached");
        }
    }
    public void ApplyBreak()
    {
        System.out.println("Speed is Decrease by 15 \nCurrent Speed is " + (speed-15));
        speed--;
    }
    void BicycleFunction()
    {
        int ch1;
        System.out.println("Bicycle Started Successfully");
        do
        {
            System.out.println("Bicycle >>>\t1.Gear Change\t2.Speed Up\t3.Apply Break\t4.Exit\n> > ");
            ch1=sc.nextInt();
            switch(ch1)
            {
                case 1: GearChange();break;
                case 2: SpeedUp();break;
                case 3: ApplyBreak();break;
            }
        }while(ch1!=4);
    }
}

class Car implements Vehicle
{
    int gear=0, speed=0;
    public void GearChange()
    {
        System.out.println("Enter Gear > ");
        gear=sc.nextInt();
        if(gear>0 && gear<7){
            System.out.println("Car Gear Changes Sucessfully \nCurrent Gear is > "+gear);
        }
        else{
            System.out.println("Gear is Out of Range !");
        }
    }
    public void SpeedUp()
    {
        System.out.println("Enter The Speed");
        speed=sc.nextInt();
        if(speed>0 && speed<151){
            System.out.println("Current Speed is > " + speed);
        }
        else{
            System.out.println("Speed Limit Reached");
        }
    }
    public void ApplyBreak()
    {
        System.out.println("Speed is Decrease by 45 \nCurrent Speed is " + (speed-45));
        speed--;
    }
    void CarFunction()
    {
        int ch2;
        System.out.println("Car Started Successfully");
        do
        {
            System.out.println("Car >>>\t1.Gear Change\t2.Speed Up\t3.Apply Break\t4.Exit\n> > ");
            ch2=sc.nextInt();
            switch(ch2)
            {
                case 1: GearChange();break;
                case 2: SpeedUp();break;
                case 3: ApplyBreak();break;
            }
        }while(ch2!=4);
    }
}

class Bike implements Vehicle
{
    int gear=0, speed=0;
    public void GearChange()
    {
        System.out.println("Enter Gear > ");
        gear=sc.nextInt();
        if(gear>0 && gear<6){
            System.out.println("Bike Gear Changes Sucessfully \nCurrent Gear is > "+gear);
        }
        else{
            System.out.println("Gear is Out of Range !");
        }
    }
    public void SpeedUp()
    {
        System.out.println("Enter The Speed");
        speed=sc.nextInt();
        if(speed>0 && speed<101){
            System.out.println("Current Speed is > " + speed);
        }
        else{
            System.out.println("Speed Limit Reached");
        }
    }
    public void ApplyBreak()
    {
        System.out.println("Speed is Decrease by 30 \nCurrent Speed is " + (speed-30));
        speed--;
    }
    void BikeFunction()
    {
        System.out.println("Bike Started Successfully");
        int ch3;
        do
        {
            System.out.println("Bike >>>\t1.Gear Change\t2.Speed Up\t3.Apply Break\t4.Exit\n> > ");
            ch3=sc.nextInt();
            switch(ch3)
            {
                case 1: GearChange();break;
                case 2: SpeedUp();break;
                case 3: ApplyBreak();break;
            }
        }while(ch3!=4);
    }
}

public class Interface 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        Bicycle A = new Bicycle();
        Car B = new Car();
        Bike C = new Bike();
        do
        {
            System.out.println("\n1.Bicycle \n2.Car \n3.Bike \n4.Exit");
            System.out.println("Enter Which Vehicle You Want to Use > > > ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    A.BicycleFunction();
                    break;
                case 2:
                    B.CarFunction();
                    break;
                case 3:                    
                    C.BikeFunction();
                    break;
            }
        }while(ch!=4);
    }
}
