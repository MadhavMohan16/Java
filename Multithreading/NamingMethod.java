public class NamingMethod extends Thread 
{
    public void run()
    {
        System.out.println("Running");
    }
    public static void main(String[]args)
    {
        NamingMethod t1=new NamingMethod();
        NamingMethod t2=new NamingMethod();
        System.out.println("Name of first thread:"+t1.getName());
        System.out.println("Name of second thread:"+t2.getName());
        System.out.println("Id of first thread:"+t1.getId());
        System.out.println("Id of Second thread:"+t2.getId());
        t1.start();
        t2.start();
        t1.setName("Sameer");
        System.out.println("After changing the name of first thread:"+t1.getName());
    }
}
