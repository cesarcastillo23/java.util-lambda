package com.bank.Test;

import com.bank.modelo.Cuenta;
import com.bank.modelo.CuentaAhorros;

public class TestCuentaExeptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta7=new CuentaAhorros(1,125);
        ((CuentaAhorros) cuenta7).depositar(5000);
        try {
            cuenta7.retirar(2000);
        } catch (SaldoInsuficienteException e) {
        }
        System.out.println(cuenta7.getSaldo());
    }
}
