package com.bank.Test;

import com.bank.modelo.CuentaAhorros;
import com.bank.modelo.CuentaCorriente;

public class testCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc=new CuentaCorriente(1,5);
        CuentaAhorros ca =new CuentaAhorros(5,4);

        cc.depositar(2500);
        cc.depositar(2500);
        cc.depositar(25000);
        cc.trasferir(5000,ca);
        cc.trasferir(10000,ca);


        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());

    }
}
