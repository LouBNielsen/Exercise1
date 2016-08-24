/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author LouiseB
 */
public class Main
{
    public static void main(String[] args)
    {
        Even even = new Even();
        Thread1 t1 = new Thread1(even);
        Thread1 t2 = new Thread1(even);
        
        t1.start();
        t2.start();
    }
    
    
    /* 
        Explain what happens?
            Hvis de to tråde ikke er synkroniseret, er det muligt for de to tråde at kalde next() metoden på samme tid.
            Dette kan resultere i at der kan blive printet ulige tal, hvilket er hvad vi gerne vil undgå.
            Så for at undgå dette benyttes synkronisering på trådene.
    
        How common is the problem?
            Problemer opstår hver gang to tråde forsøger at benytte samme metode på samme tid.
    */
}
