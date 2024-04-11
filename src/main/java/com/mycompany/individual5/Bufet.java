/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual5;

import java.util.concurrent.Semaphore;
/**
 *
 * @author Z-V
 */
public class Bufet {
    private Semaphore table = new Semaphore(2);
    
    public void waiting (Student student) throws InterruptedException {
        System.out.println("Student" + student.getNumber() + " waiting");
        table.acquire();
    }

    public void eating (Student student) throws InterruptedException {
        System.out.println("Student" + student.getNumber() + " eating");
        Thread.sleep(3000);
    }

    public void exit(Student student) {
        System.out.println("Student" + student.getNumber() + " exit");
        table.release();
    }
    
}
