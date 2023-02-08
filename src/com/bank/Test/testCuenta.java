package com.bank.Test;

import com.bank.modelo.cuentaAhorros;
import com.bank.modelo.cuentaCorriente;

public class testCuenta {
    public static void main(String[] args) {
        cuentaCorriente cc=new cuentaCorriente(1,5);
        cuentaAhorros ca =new cuentaAhorros(5,4);

        cc.depositar(2500);
        cc.depositar(2500);
        cc.depositar(25000);
        cc.trasferir(5000,ca);
        cc.trasferir(10000,ca);


        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());

    }
}
