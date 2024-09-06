package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
      CuentaBancaria cuenta = new CuentaBancaria("Janier","34",30000);
        
     cuenta.CalcularInteres();
      cuenta.setTipoInteres(20);
       cuenta.retirar(0);
    
       CuentaBancaria cuenta2 = new CuentaBancaria("Farid","23",90000);
       
       cuenta2.CalcularInteres();
       cuenta2.ingresar(0);
       cuenta2.setTipoInteres(5);
       
    }
}