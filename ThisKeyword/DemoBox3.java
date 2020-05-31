class Box8
{
    private int a,b;
    public Box8(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equals(Box8 ob)
    {
        if(ob.a==a  &&  ob.b==b)
            return true;
        else
            return false;
    }
}
class DemoBox3
{
     public static void main(String[]args)
    {
    Box8 ob1=new Box8(1,2);
    Box8 ob2=new Box8(1,2);
    Box8 ob3=new Box8(7,7);
    System.out.println("ob1==ob2:"+ob1.equals(ob2));
    System.out.println("ob1==ob3:"+ob1.equals(ob3));
    }
}


    
                
    
        