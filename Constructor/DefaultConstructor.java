class Test2
{
    private
    double width;
    double height;
    double depth;
    public Test2()
    {
        System.out.println("Default constructor");
        width=10;
        height=10;
        depth=10;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class DefaultConstructor
{
    public static void main(String[]args)
    {
        Test2 ob1=new Test2();
        Test2 ob2=new Test2();
        double vol;
        vol=ob1.volume();
        System.out.println("Volume="+vol);
        vol=ob2.volume();
        System.out.println("Volume="+vol);
    }
}