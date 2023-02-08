package com.bank.modelo;

import com.bank.Test.SaldoInsuficienteException;

public class cuentaCorriente extends Cuenta {


    public cuentaCorriente(int agencia,int numero){
        super(agencia,numero);
    }

    @Override
    public void retirar(double valor) throws SaldoInsuficienteException {
        double comision=0.2;
        super.retirar(valor+comision);
    }

    @Override
    public void depositar(double valor) {{
        if(valor > 0)
            this.saldo+=valor;
    }

    }
}
