package com.bank.Test;

import com.bank.modelo.Cliente;
import com.bank.modelo.Cuenta;
import com.bank.modelo.CuentaAhorros;
import com.bank.modelo.CuentaCorriente;

public class TestObject {
    public static void main(String[] args) {
        int[] edades=new int[5];
        for (int i=0;i<edades.length;i++){
            edades[i]=i * i;
        }
        for (int i=0;i<edades.length;i++){
            System.out.println("Soy el 2");
            System.out.println(edades[i]);
        }

        CuentaCorriente cc = new CuentaCorriente(32,24);
//        Cuenta[] cuentas= new Cuenta[5];
//        cuentas[1]=cc;
//        CuentaAhorros ca =new CuentaAhorros(45,54);
//        cuentas[3]=ca;
//        cuentas[0]= new CuentaCorriente(45,54);
//        System.out.println(cuentas[0]);
//        CuentaCorriente cuenta= (CuentaCorriente) cuentas[1];
//        System.out.println(cuentas[1]);
        /////////////////////////////////////////
        Object[] referencias= new Object[5];
        referencias[1]=cc;
        Cliente obtenido= (Cliente) referencias[4];
        CuentaAhorros ca =new CuentaAhorros(45,54);
        referencias[3]=ca;
        referencias[0]= new CuentaCorriente(45,54);
        System.out.println(referencias[0]);
        CuentaCorriente cuenta= (CuentaCorriente) referencias[1];
        System.out.println(referencias[3]);







    }
}
