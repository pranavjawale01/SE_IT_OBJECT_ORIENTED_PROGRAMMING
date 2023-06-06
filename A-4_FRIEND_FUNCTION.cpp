#include<iostream>
using namespace std;

class Second; //FORWARD DECLARATION

class First
{
        private:
                int m,cm;
                friend void unit(First, Second);
        public:
                void getData();
                void displayData();
                
};
void First :: getData()
{
        cout<<"\nEnter Measurement in M : ";
        cin>>m;
        cout<<"\nEnter Measurement in CM : ";
        cin>>cm;
}
void First :: displayData()
{
        cout<<"\nMeter : "<<m;
        cout<<"\nCentiMeter : "<<cm;
}

class Second
{
        private:
                int feet,inches;
                friend void unit(First, Second);
        public:
                void getData();
                void displayData();
};
void Second :: getData()
{
        cout<<"\nEnter Measurement in feet : ";
        cin>>feet;
        cout<<"\nEnter Measurement in inches : ";
        cin>>inches;
}
void Second :: displayData()
{
        cout<<"\nFeet : "<<feet;
        cout<<"\nInches : "<<inches;
}

void unit(First u1, Second u2)
{
        int d1,d2,d3,d4;
        int m1=u1.m;
        int cm1=0.01*u1.cm;
        int feet1=0.3048*u2.feet;
        int inches1=0.0254*u2.inches;
        d1=m1+feet1;
        d2=cm1+inches1;
        d3=m1-feet1;
        d4=cm1-inches1;
        cout<<"\nDistance(Meter + Feet) = "<<d1<<" Meter";
        cout<<"\nDistance(Centimeter + inches) = "<<d2<<" Meter";
        cout<<"\nDistance(Meter - Feet) = "<<d3<<" Meter";
        cout<<"\nDistance(Centimeter - inches) = "<<d4<<" Meter";
}

int main()
{
        First obj1;
        Second obj2;
        obj1.getData();
        obj2.getData();
        obj1.displayData();
        obj2.displayData();
        unit(obj1,obj2);
        return 0;
}
