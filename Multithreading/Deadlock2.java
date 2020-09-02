public class Deadlock2
{
    public static void main(String[]args)
    {
        final String resource1="sameer";
        final String resource2="vineet";
        Thread t1=new Thread(){//Asynchronous class start
            public void run()
            {
            synchronized(resource1)//Synchronized block start
            {
                System.out.println("Thread 1: locked resource 1");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            synchronized(resource2)
            {
                System.out.println("Thread 1: locked resource 2");
            }
        }//Synchronized block end
        }
        };//Asynchronous class start
        
    
         Thread t2=new Thread(){//Asynchronous class start
            public void run()
            {
            synchronized(resource2)//Synchronized block start
            {
                System.out.println("Thread 2: locked resource 2");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            synchronized(resource1)
            {
                System.out.println("Thread 2 : locked resource 1");
            }
        }//Synchronized block end
        }   
        };//Asynchronous class end
                t1.start();
                t2.start();
    }
}
