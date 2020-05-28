class Box1
{
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
class DemoBox1
{
    public static void main(String[]args)
    {
        Box1 b1=new Box1();
        Box1 b2=new Box1();
        b1.putdata();
        b2.putdata(1,2,3);
        b1.l=20;//seurity break ho rhi hai
        b2.b=10;//seurity break ho rhi hai
        b1.display();
        b2.display();
        b1.volume();
        b2.volume();
    }
}