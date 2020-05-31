class Box9
{
    double width;
    double height;
    double depth;
    public Box9()
    {
        width=10;
        height=10;
        depth=10;
    }
    public Box9(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    public Box9(Box9 ob)
    {
     width=ob.width;
     height=ob.height;
     depth=ob.depth;
    }
    public Box9(double len)
    {
        width=len;
        height=len;
        depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class DemoBox4
{
    public static void main(String[]args)
    {
        Box9 ob1=new Box9(10,20,15);
        Box9 ob2=new Box9();
        Box9 ob3=new Box9(7);
        Box9 ob4=new Box9(ob1);
        double vol;
        vol=ob1.volume();
        System.out.println("Voulme="+vol);
         vol=ob2.volume();
        System.out.println("Voulme="+vol);
         vol=ob3.volume();
        System.out.println("Voulme="+vol);
         vol=ob4.volume();
        System.out.println("Voulme="+vol);
    }
}