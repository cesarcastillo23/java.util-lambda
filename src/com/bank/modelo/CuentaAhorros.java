package com.bank.modelo;

public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(int agencia, int numero){
        super (agencia,numero);
    }

    @Override
    public void depositar(double valor) {
        {
            if(valor > 0)
                this.saldo+=valor;
        }
    }
}
