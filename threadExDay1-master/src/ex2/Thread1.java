/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import static ex2.Even.next;

/**
 *
 * @author LouiseB
 */
public class Thread1 extends Thread
{

    Even even;

    public Thread1(Even even)
    {
        this.even = even;
    }

    @Override
    public void run()
    {
        synchronized (even)
        {
            while (true)
            {
                int i = next();

                if(i % 2 == 1)
                {
                 System.out.println(i);   
                }

            }
        }
    }

}
