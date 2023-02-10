package com.bank.Test;


import com.bank.modelo.CuentaCorriente;

public class TestArreglos {
    public static void main(String[] args) {
        CuentaCorriente cc =new CuentaCorriente(1,2);
        CuentaCorriente[] cuentas=new CuentaCorriente[5];
        cuentas[1]=cc;
        System.out.println(cc);
        System.out.println(cuentas[1]);
        System.out.println(cuentas[0]);

        for (int i=0;i<cuentas.length; i++){
            System.out.println(cuentas[i]);
        }

    }
}
