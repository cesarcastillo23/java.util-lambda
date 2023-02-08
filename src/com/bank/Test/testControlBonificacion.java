package com.bank.Test;

import com.bank.modelo.*;


public class testControlBonificacion {
    public static void main(String[] args) {
        funcionario nicolas=new contador();

        nicolas.setSalario(2000);

        gerente ximena=new gerente();
        ximena.setSalario(1000);

        contador alex= new contador();
        alex.setSalario(3000);
        control controlBonificacion=new control();
        controlBonificacion.registrarSalario(nicolas);
        controlBonificacion.registrarSalario(ximena);
        controlBonificacion.registrarSalario(alex);

    }
}
