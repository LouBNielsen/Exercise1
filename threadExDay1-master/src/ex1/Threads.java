/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author LouiseB
 */
public class Threads
{

    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
        t3.stop();
    }

    public static class Thread1 extends Thread
    {

        @Override
        public void run()
        {
            long sum = 0;
            for (int i = 0; i <= 1000000000; i++)
            {
                sum += i;
            }
            System.out.println(sum);
        }
    }

    public static class Thread2 extends Thread
    {

        @Override
        public void run()
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);

                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException ex)
                {
                    System.out.println(ex.toString());
                }
            }
        }
    }

    public static class Thread3 extends Thread
    {

        @Override
        public void run()
        {
            int i = 10;

            while (true)
            {
                try
                {

                    Thread.sleep(3000);

                    System.out.println(i++);
                } catch (InterruptedException ex)
                {
                    System.out.println(ex.toString());
                }
            }
        }
    }
}
