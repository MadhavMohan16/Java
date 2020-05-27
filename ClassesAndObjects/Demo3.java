class Test3
{
    int a;
    int b;
    int c;
    void putdata()
    {
        a=10;
        b=20;
        c=30;
    }
    void display()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class Demo3
{
    public static void main(String[]args)
    {
        Test3 ob1=new Test3();
        Test3 ob2=new Test3();
        ob1.putdata();
        ob2.putdata();
        ob1.display();
        ob2.display();
    }
}