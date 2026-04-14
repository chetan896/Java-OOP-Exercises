public class PR72
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        Thread t3 = new Thread(new T3());

        try
        {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        }
        catch (Exception e)
        {
        }
    }
}

class T1 implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }
    }
}

class T2 implements Runnable
{
    public void run()
    {
        for (int i = 101; i <= 200; i++)
        {
            System.out.println(i);
        }
    }
}

class T3 implements Runnable
{
    public void run()
    {
        for (int i = 201; i <= 300; i++)
        {
            System.out.println(i);
        }
    }
}