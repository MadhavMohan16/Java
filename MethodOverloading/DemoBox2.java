class Box2
{
    private
    int l,b,h;
    void putdata()
    {
        l=10;
        b=10;
        h=10;
    }
    void putdata(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
    }
    void display()
    {
        System.out.println(l+" "+b+" "+h);
    }
    void volume()
    {
        System.out.println("Volume="+(l*b*h));
    }
}
class DemoBox2
{
    public static void main(String[]args)
    {
        Box2 b1=new Box2();
        Box2 b2=new Box2();
        b1.putdata();
        b2.putdata(1,2,3);
        b1.l=20;//private hai
        b2.b=10;//private hai
        b1.display();
        b2.display();
        b1.volume();
        b2.volume();
    }
}        

                
    
    