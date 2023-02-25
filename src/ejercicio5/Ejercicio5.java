/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double suma=0, x,y;
        
        Scanner leerporteclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x ");
        x = leerporteclado.nextDouble();
        
        System.out.println("Ingrese el valor de y ");
        y = leerporteclado.nextDouble();
        suma = suma + x;
        System.out.println("El valor de la suma es :" + suma);
        x = x + Math.pow(y, 2);
        suma = suma + (x/y);
        System.out.println("El valor de la suma es :" + suma);
        
    }
    
}
