class Test3
{
    private
    double width;
    double height;
    double depth;
    public Test3(double w,double h,double d)
    {
        System.out.println("Parameterised constructor");
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class ParameterisedConstructor
{
    public static void main(String[]args)
    {
        Test3 ob1=new Test3(10,20,15);
        Test3 ob2=new Test3(3,6,9);
        double vol;
        vol=ob1.volume();
        System.out.println("Volume="+vol);
        vol=ob2.volume();
        System.out.println("Volume="+vol);
    }
}
        
            