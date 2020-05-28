class Overloading
{
    void area(int s)
    {
        System.out.println("Area of square="+(s*s));
    }
    void area(int l,int b)
    {
        System.out.println("Area of rectangle="+(l*b));
    }
    void area(double r)
    {
        System.out.println("Area of circle="+(Math.PI)*r*r);
    }
}
class DemoOverloading
{
    public static void main(String[]args)
    {
        Overloading ob=new Overloading();
        ob.area(3);
        ob.area(4,3);
        ob.area(3.0);
    }
}