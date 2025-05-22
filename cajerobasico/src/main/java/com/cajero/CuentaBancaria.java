package com.cajero;

public class CuentaBancaria {
    
    public String titular;
    private int saldo;

    public int depositar(int deposito){
        return this.saldo += deposito;
    }

    public int retirar(int retiro){
        if (retiro > saldo) {
            System.out.println("Saldo insuficiente.");
            return saldo;
            
        } else {
            saldo -= retiro;
            System.out.println("Has retirado :" + retiro + "euros");
            return saldo;
        }
        
    }

    public int consultarSaldo(){
        System.out.println("Tu saldo actual es: " + saldo + "euros");
        return saldo;
    }
}