package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class CuentaBancaria {

    private String Titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    Scanner lector = new Scanner(System.in);

    public CuentaBancaria(String Titular, String numeroCuenta, double saldo) {
        this.Titular = Titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.5;
    }

    public String getTitular() {
        return Titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void ingresar(double cantidad) {
        System.out.println("Ingrese una cantidad a consignar");
        cantidad = lector.nextInt();
        double Incremento = saldo + cantidad;
        System.out.println("Su saldo actual es: " + Incremento);

    }

    public void retirar(double cantidad) {
        
        
        if (cantidad < saldo) {
            System.out.println("Usted puede hacer su retiro");
        } else {
            System.out.println("No puede retirar mas de la cantidad que tiene en la cuenta");
        }
         
        System.out.println("Ingrese una cantidad a retirar");
        cantidad = lector.nextInt();
        double decremento = saldo - cantidad;
        System.out.println("Saldo queda en: "+ decremento);
        
    }
      public void CalcularInteres(){
          
          
          if (saldo> 0 ) {
              double SaldoConInteres = saldo + (saldo * tipoInteres / 100);
              System.out.println("Su saldo con interes aplicado es de:" + SaldoConInteres);
          } else {
              
          }
          
          
      }

    public void setTipoInteres(double tipoInteres) {
        
       if (tipoInteres > 0 && tipoInteres < 10) {
                System.out.println("El tipo de interes " + tipoInteres + " es valido.");
                
                 double SaldoConInteres = saldo + (saldo * tipoInteres / 100);
                System.out.println("Su saldo con el interes actual es : " + SaldoConInteres);
                
            } else {
                System.out.println("El tipo de interes " + tipoInteres + " es invalido.");
               
               
    }
      
    }
 }
