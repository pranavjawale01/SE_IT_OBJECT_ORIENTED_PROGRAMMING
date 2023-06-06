//Interface Car
package FactoryDesign;

public interface Car 
{
	public abstract void CarSpec();
}

//Class SUV
package FactoryDesign;

public class SUV implements Car
{
    	@Override
	public void CarSpec()
	{
		System.out.println("\nModel : XUV700"
				+ "\nPrice : 14 Lakh"
				+ "\nType : Turbo Petrol With Direct Injection (TGDi)"
				+ "\nCapacity : 2.0 L"
				+ "\nMax. Power : 147kW @5000 r/min"
				+ "\nMax. Torque : 380 Nm @ 1750-3000 r/min"
				+ "\nTransmission Type : 6 MT / 6 AT");
	}
}

//Class Sedan
package FactoryDesign;

public class Sedan implements Car
{
    	@Override
	public void CarSpec()
	{
		System.out.println("Model : Honda City 4th Gen"
				+ "\nEngine displacement : 1498 cc"
				+ "\nMileage : 17.8kmpl and 18.4 kmpl"
				+ "\nSeating capacity : 5"
				+ "Price : Rs. 11.6 lakh to Rs. 15.3 lakh");
	}
}

//Class HatchBack
package FactoryDesign;

public class HatchBack implements Car
{
	@Override
	public void CarSpec()
	{
		System.out.println("\nModel : Chevrolet Sail Hatchback"
				+ "\nPrice : 5 Lakh"
				+ "\nFuel Type : PetrolEngine "
				+ "\nDisplacement (cc)1199No. of cylinder 4 Max Power (bhp@rpm) 82.5bhp@6000 rpmMax "
				+ "\nSeating Capacity : 5 "
				+ "\nFuel Tank Capacity : 42.0");
	}
}

//Class CarFactory
package FactoryDesign;

public class CarFactory 
{
	public Car getNewCar(int ch) 
	{

        if(ch==1)
        {
            return new SUV();
        }
        else if(ch==2)
        {
            return new HatchBack();
        }
        else if(ch==3)
        {
            return new Sedan();
        }
        return null;
	}
}

//Class FactoryMain
package FactoryDesign;

import java.util.Scanner;

public class FactoryMain 
{
	public static void main(String[] args)
	{
		int ch;
		CarFactory obj = new CarFactory();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\n1.SUV \n2.HatchBack \n3.Sedan \n4.Exit \nEnter Your Choice > > > ");
			ch=sc.nextInt();
			Car carobj = obj.getNewCar(ch);
			switch(ch)
			{
				case 1:
					carobj.CarSpec();
					break;
				case 2:
					carobj.CarSpec();
					break;
				case 3:
					carobj.CarSpec();
					break;
			}
		}while(ch!=4);
	}
}
