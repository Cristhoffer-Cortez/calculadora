/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author JANETH
 */
public class Calculadora {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        num1=scanner.nextInt();
        System.out.println("Ingresta el segundo numero: ");
        num2=scanner.nextInt();
        
        Operaciones operaciones=new Operaciones(num1, num2);
        System.out.println("La suma de tus numeros es: "+ operaciones.suma());
        
        System.out.println("La resta de tus numeros es: "+ operaciones.resta());
        
        System.out.println("La multiplicacion de tus numeros es: "+ operaciones.multiplicacion());
        
        if(num2!=0){
        System.out.println("La divicion de tus numeros es: "+ operaciones.divicion());
        }else{
        System.out.println("!NO SE PUEDE DIVIDIR POR CERO!");    
        }
    }
}
