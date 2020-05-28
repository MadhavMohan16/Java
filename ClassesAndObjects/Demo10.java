class Test10
{
    double width;
    double height;
    double depth;
    void setDim(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width * height * depth;
    }
}
class Demo10
{
    public static void main(String[]args)
    {
        Test10 ob1=new Test10();
        Test10 ob2=new Test10();
        double vol;
        ob1.setDim(10,20,15);
        ob2.setDim(3,6,9);
        vol=ob1.volume();
        System.out.println("Volume="+vol);
        vol=ob2.volume();
        System.out.println("Volume="+vol);
    }
}