import java.util.Scanner;
public class Bag
{   
    Bag()
    {
        weight = 1;
        color ="Green";
        System.out.printf("\nThe weight is %f and the color is %s ", weight , color);
    }
    static Scanner inp = new Scanner(System.in);
    float weight;
    static float total_wt;
    int total_obj;
    String color;
    Bag(double a)
    {
        System.out.println("\nEnter the weight of the Object >  ");
        weight = inp.nextFloat();
        System.out.println("\nEnter the color of the Object > ");
        color = inp.next();
        System.out.printf("\nThe weight is %f and the color is %s ", weight , color);
    }
    
    Bag(int wt)
    {
        System.out.println("\nEnter the Weight of object > ");
        weight = inp.nextFloat();
        color = "Green";
        System.out.printf("\nThe weight is %f and the color is %s \n", weight , color);
    }
    
    Bag(String col)
    {
        System.out.println("\nEnter the Color of object > ");
        weight = 1;
        color = inp.next();
        System.out.printf("\nThe weight is %f and the color is %s ", weight , color);
    }
    
    
    void add(float []bag_wt, String []bag_col, Bag obj)
    {
        total_obj++;
        bag_wt[total_obj] = obj.weight;
        bag_col[total_obj] = obj.color;
    }
    
    public static void main(String[] args) 
    {
        int n;
        System.out.println("\nEnter the number of Objects > > > ");
        n = inp.nextInt();
        float []bag_wt = new float[n];
        String []bag_col = new String[n];
        int ch;
        do
        {
            System.out.println("\n1.Add object with color \n2.Add object with weight \n3.Add object with both color and weight \n4.Add a default object \n5.Exit");
            ch = inp.nextInt();
            switch(ch) 
            {
            case 1:
                Bag obj1 = new Bag("Black");
                obj1.add(bag_wt, bag_col, obj1);
                break;
            case 2:
                Bag obj2 = new Bag(1);
                obj2.add(bag_wt, bag_col, obj2);
                break;
            case 3:
                Bag obj3 = new Bag(1.1);
                obj3.add(bag_wt, bag_col, obj3);
                break;
            case 4:
                Bag obj4 = new Bag();
                obj4.add(bag_wt, bag_col, obj4);
                break;
            }
        }while(ch != 5);
    }
}
