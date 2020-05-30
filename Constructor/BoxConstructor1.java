class Box1
{
    private int l,b,h;
    public Box1()
    {
        l=10;
        b=10;
        h=10;
    }
    public Box1(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
    }
    int volume()
    {
        return l*b*h;
    }
}
class BoxConstructor1
{
    public static void main(String[]args)
    {
        Box1 b1=new Box1();
        Box1 b2=new Box1(1,2,3);
        int vol;
        vol=b1.volume();
        System.out.println("Volume="+vol);
        vol=b2.volume();
        System.out.println("Volume="+vol);
    }
}