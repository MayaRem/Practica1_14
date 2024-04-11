/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual5;

/**
 *
 * @author Z-V
 */

public class Student implements Runnable {
    private int number;
    private Bufet bufet;

    public Student(int number, Bufet bufet) {
        this.number = number;
        this.bufet = bufet;
    }
    
    public int getNumber() {
        return number;
    }
    
    @Override
    public void run(){
        try{
            bufet.waiting(this);
            bufet.eating(this);
            bufet.exit(this);
        }catch(InterruptedException ex){
          System.out.println("Error: " + ex.getMessage());
        }
    }

}
