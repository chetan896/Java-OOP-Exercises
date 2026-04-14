public class PR73
{
    public static void main(String[] args) 
    {
        Table t = new Table();

        Thread t1 = new Thread(new T1(t));
        Thread t2 = new Thread(new T2(t));

        t1.start();
        t2.start();
    }
}

class Table
{
    synchronized void printTable(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n +" x "+ i +" = "+ (n * i));
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
            }
        }
    }
}

class T1 implements Runnable
{
    Table t;

    T1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(5);
    }
}

class T2 implements Runnable
{
    Table t;

    T2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(7);
    }
}