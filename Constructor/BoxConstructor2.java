class Box2
{
    private int l,b,h;
    public Box2(int x,int y,int z)
    {
       l=x;
       b=y;
       h=z;
    }
    void display()
    {
        System.out.println(l+" "+b+" "+h);
    }
}
class BoxConstructor2
{
    public static void main(String[]args)
    {
        Box2 b1=new Box2();
        Box2 b2=new Box2(1,2,3);
        b1.display();
        b2.display();
    }
}