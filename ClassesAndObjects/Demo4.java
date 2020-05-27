class Test4
{
    int a;
    int b;
    int c;
    void putdata(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
 class Demo4
{
    public static void main(String[]args)
    {
        Test4 ob1=new Test4();
        Test4 ob2=new Test4();
        ob1.putdata(10,20,30);
        ob2.putdata(40,50,60);
        ob1.display();
        ob2.display();
    }
}