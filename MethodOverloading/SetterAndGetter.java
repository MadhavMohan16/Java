class Box3
{
    private int l,b,h;
    void putdata()
    {
        l=10;
        b=10;
        h=10;
    }
    void putdata(int x,int y,int z)//Setter method
    {
        l=x;
        b=y;
        h=z;
    }
    int volume()//Getter method
    {
        return l*b*h;
    }
}
class SetterAndGetter
{
    public static void main(String[]args)
    {
        Box3 b1=new Box3();
        Box3 b2=new Box3();
        b1.putdata();
        b2.putdata(1,2,3);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
    }
}