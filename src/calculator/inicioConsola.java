/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
import logica.operaciones;

/**
 *
 * @author sala205
 */
public class inicioConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora calcu = new calculadora();
        calcu.setLocationRelativeTo(null);
        calcu.setVisible(true);
        Scanner sc = new Scanner(System.in);
       
        System.out.println("ingrese numero 1");
        int n1 = sc.nextInt();
        System.out.println("ingrese numero 2");
        int n2 = sc.nextInt();
        System.out.println("ingrese operacion: ");
        System.out.println("1 para sumar");
        System.out.println("2 para restar");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");
        System.out.print("Opcion: ");
        int res = sc.nextInt();
        switch (res) {
            case 1:
                System.out.print("el resultado es: ");
                System.out.println(operaciones.sumar(n1, n2));
                break;
            case 2:
                System.out.print("el resultado es: ");
                System.out.println(operaciones.sumar(n1, n2));
                break;
            case 3:
                System.out.print("el resultado es: ");
                System.out.println(operaciones.sumar(n1, n2));
                break;
            case 4:
                System.out.print("el resultado es: ");
                System.out.println(operaciones.sumar(n1, n2));
                break;
        }
        

    }

}
