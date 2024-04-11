/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.individual5;

/**
 *
 * @author Z-V
 */
public class Individual5 {

    public static void main(String[] args) {
        System.out.println("Ремизова Майя. РИБО-02-22. Вариант 2.");
        
        Bufet bufet = new Bufet();
        
        for (int i = 1; i <=7; i++) {
            new Thread(new Student(i,bufet)).start();
        }
    }
}
