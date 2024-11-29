/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Laboratorios DCCO
 */
public class Calculadora {

   
    
    
    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("CALCULADORA DE OPERACIONES BASICAS");
        System.out.println("");
        System.out.println("Ingresa el primer numero: ");
        num1=scanner.nextInt();
        System.out.println("Ingresta el segundo numero: ");
        num2=scanner.nextInt();
        
        Operaciones operaciones1=new Operaciones(num1, num2);
        System.out.println("");

        System.out.println("La suma de tus numeros es: "+ operaciones1.suma());
        System.out.println("");

        System.out.println("La resta de tus numeros es: "+ operaciones1.resta());
        System.out.println("");

        System.out.println("La multiplicacion de tus numeros es: "+ operaciones1.multiplicacion());
        System.out.println("");

        System.out.println("La divicion de tus numeros es: "+ operaciones1.divicion());                         
        
    }

}
