/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classifytriangle;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class onthespotcode2 {

    /**
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static int classifyTriangle(int a, int b, int c) {
        if (a <= 0) return 0;
        if (b <= 0) return 0;
        if (c <= 0) return 0;

        
        if (a + b <= c) return 0;
        if (a + c <= b) return 0;
        if (b + c <= a) return 0;

        
        if (a == b && b == c) return 1;  
        if (a == b) return 2;            
        if (a == c) return 2;
        if (b == c) return 2;
        return 3;                        
    }

    public static void main(String[] args) {
        System.out.println(classifyTriangle(5, 5, 5)); 
        System.out.println(classifyTriangle(5, 5, 8)); 
        System.out.println(classifyTriangle(3, 4, 5)); 
        System.out.println(classifyTriangle(1, 2, 3)); 
        System.out.println(classifyTriangle(0, 4, 5)); 
    }
}
