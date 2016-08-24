/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author LouiseB
 */
public class Svar
{
    /*
        What is the obvious problem with this solution?
            Når man kører metoden i ex3.BallDemo.java bliver en tråd kørt.
            Problemet med denne ene tråden er, at tråden kører uendeligt.
            Idet tråden kører uendeligt, kan andre funktioner ikke køres.
            Måden vi løser dette problem på er ved at skabe flere tråde.
            Dette gøres ved extende Ball.java classen og ved at gøre bolden fra BallDemo.java til en tråd.
    
    FRA:
    class Ball
    
    TIL:
    class Ball extends Thread
    
    og
    
    FRA:
    ball.run();
    
    TIL:
    
    ball.start();
    
    */
}
