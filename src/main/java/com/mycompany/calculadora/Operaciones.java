/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;

public class Operaciones{
    private int num1;
    private int num2;
    
    public Operaciones(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    
    }
    public int suma(){
     return num1+num2;
    }
    public int resta(){
     return num1-num2;
    }
    public int multiplicacion(){
     return num1*num2;
    }
    public double divicion(){
     return (double)num1/num2;
    }
    
}
