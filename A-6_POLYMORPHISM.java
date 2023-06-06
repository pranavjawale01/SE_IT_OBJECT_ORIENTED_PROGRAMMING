import java.util.Scanner;

abstract class shape
{
    Scanner sc = new Scanner(System.in);
    abstract double calculatearea();
};

class circle extends shape
{
    double radius , area;
    void getdimension() {
        System.out.println("enter the radius of circle: ");
        radius = sc.nextDouble();
    }
    //Override
    double calculatearea() {
        area = 3.14 * radius *radius;
        System.out.println("the area is : "+ area);
        return area;
    }
}

class triangle extends shape
{
    double base , height , area;
    void getdimension() {
        System.out.println("enter the base of triangle: ");
        base = sc.nextDouble();
        System.out.println("enter the height of triangle: ");
        height = sc.nextDouble();
    }
    //Override
    double calculatearea() {
        area = 0.5 * base * height;
        System.out.println("the area is : "+ area);
        return area;
    }
}

class rectangle extends shape
{
    double length , height , area;
    void getdimension() {
        System.out.println("enter the length of rectangle: ");
        length = sc.nextDouble();
        System.out.println("enter the height of reectangle: ");
        height = sc.nextDouble();
    }
    //Override
    double calculatearea() {
        area = length * height;
        System.out.println("The area is : "+ area);
        return area;
    }
}

public class main {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Which shape do you want to do operation??\n 1.Circle\n 2.Triangle\n 3.Rectangle\n 4.Exit\nENTER YOUR CHOICE: ");
            Scanner inp = new Scanner(System.in);
            choice = inp.nextInt();
            switch(choice)
            {
                case 1 :
                    circle cir = new circle();
                    cir.getdimension();
                    cir.calculatearea();
                    break;
                case 2 :
                    triangle tri = new triangle();
                    tri.getdimension();
                    tri.calculatearea();
                    break;
                case 3 :
                    rectangle rect = new rectangle();
                    rect.getdimension();
                    rect.calculatearea();
                    break;
            }
        }while(choice != 4);
    }
}
