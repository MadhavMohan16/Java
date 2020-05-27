class Test6
{
    double width;
    double height;
    double depth;
}
class Demo6
{
    public static void main(String[]args)
    {
        Test6 ob1=new Test6();
        Test6 ob2=new Test6();
        double vol;
        ob1.width=10;
        ob1.height=20;
        ob1.depth=15;
        ob2.width=3;
        ob2.height=6;
        ob2.depth=9;
        vol=ob1.width*ob1.height*ob1.depth;
        System.out.println("Volume="+vol);
        vol=ob2.width*ob2.height*ob2.depth;
        System.out.println("Volume="+vol);
    }
}
        