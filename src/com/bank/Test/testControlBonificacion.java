package com.bank.Test;

import com.bank.modelo.*;

public class testControlBonificacion {
    public static void main(String[] args) {
        Funcionario nicolas=new Contador();

        nicolas.setSalario(2000);

        Gerente ximena=new Gerente();
        ximena.setSalario(1000);

        Contador alex= new Contador();
        alex.setSalario(3000);
        Control controlBonificacion=new Control();
        controlBonificacion.registrarSalario(nicolas);
        controlBonificacion.registrarSalario(ximena);
        controlBonificacion.registrarSalario(alex);

    }
}
