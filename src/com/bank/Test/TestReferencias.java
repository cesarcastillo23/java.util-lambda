package com.bank.Test;

import com.bank.modelo.*;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario empleado1=new Contador();
        empleado1.setNombre("alejandro");

        Gerente produccion =new Gerente();
        produccion.setNombre("ximena");

        empleado1.setSalario(2000);
        produccion.setSalario(4000);


    }

}
