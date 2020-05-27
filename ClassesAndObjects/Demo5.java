class Test5
{
    double width;
    double height;
    double depth;
}
class Demo5
{
    public static void main(String[]args)
    {
        Test5 ob=new Test5();
        double vol;
        ob.width=10;
        ob.height=20;
        ob.depth=15;
        vol=ob.width*ob.height*ob.depth;
        System.out.println("Volume="+vol);
    }
}
    