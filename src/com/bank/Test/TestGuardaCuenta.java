package com.bank.Test;

import com.bank.modelo.Cuenta;
import com.bank.modelo.CuentaCorriente;
import com.bank.modelo.GuardaCuenta;

public class TestGuardaCuenta {
    public static void main(String[] args) {
        GuardaCuenta guardaCuenta = new GuardaCuenta();
        Cuenta cc = new CuentaCorriente(11,22);
        guardaCuenta.adicionar(cc);
        GuardaCuenta guardaCuenta2 = new GuardaCuenta();
        Cuenta cc2 = new CuentaCorriente(11,22);
        guardaCuenta.adicionar(cc2);

        guardaCuenta.obtener(1);
        System.out.println(guardaCuenta.obtener(0));
        System.out.println(guardaCuenta.obtener(1));



    }
}
