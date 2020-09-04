public class PriorityMethod extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[]args)
    {
        PriorityMethod t1=new PriorityMethod();
        PriorityMethod t2=new PriorityMethod();
        t1.setPriority(Thread.MIN_PRIORITY);//1
        t2.setPriority(Thread.MAX_PRIORITY);//10
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getPriority());
    }
}



