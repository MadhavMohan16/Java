class Test7
{
    double width;
    double height;
    double depth;
    void volume()
    {
        System.out.print("Volume=");
        System.out.println(width*height*depth);
    }
}
class Demo7
{
    public static void main(String[]args)
    {
        Test7 ob1=new Test7();
        Test7 ob2=new Test7();
        ob1.width=10;
        ob1.height=20;
        ob1.depth=15;
        ob2.width=3;
        ob2.height=6;
        ob2.depth=9;
        ob1.volume();
        ob2.volume();
    }
}
