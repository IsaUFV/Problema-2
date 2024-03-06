/*Ingresar tres valores por teclado, si todos iguales imprimir suma del primero y el segundo multiplicado por el tercero.
 */
package Problema2;

import java.util.Scanner;

/**
 *
 * @author misab
 */
public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1 = teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2 = teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3 = teclado.nextInt();
        if (num1 == num2 && num1 == num3){
            int suma = num1 + num2;
            System.out.print("La suma del primero y el segundo:");
            System.out.println(suma);
            int producto = (suma * num3);
            System.out.print("La suma del primero y segundo multiplicado por el tercero:");
            System.out.println(producto);
        }
    }
 
}
