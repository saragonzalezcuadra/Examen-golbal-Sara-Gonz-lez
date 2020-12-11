/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saragonzález;

import java.util.Scanner;

/**
 *
 * @author DAM117
 */
public class SaraGonzález {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int op; // Opción
        double num;
        double result;
            System.out.println("MENÚ DE OPCIONES: "
                    + "\n\t1. Cambio de unidades de horas a segundos."
                    + "\n\t2. Cambio de unidades de kilómetros a metros."
                    + "\n\t3. Salir.");
            System.out.print("Introduce una opción: ");
            op=teclado.nextInt();
            switch (op){
                case 1:
                    System.out.print("Introduce el número de horas: ");
                    num=teclado.nextDouble();
                    result=num*3600;
                    System.out.println(num+" horas son "+result+" segundos.");
                    break;
                case 2:
                    System.out.print("Introduce el número de kilómetros: ");
                    num=teclado.nextInt();
                    result=num*1000;
                    System.out.println(num+" kilómetros son "+result+" metros.");
                    break;
                case 3:
                    System.out.println("Has salido.");
                    break;
                default: 
                    System.out.println("Opción no válida, ejecuta de nuevo el programa.");
                }
    }
    
}
