package com.bank.Test;

import com.bank.modelo.*;

public class testReferencias {
    public static void main(String[] args) {
        funcionario empleado1=new contador();
        empleado1.setNombre("alejandro");

        gerente produccion =new gerente();
        produccion.setNombre("ximena");

        empleado1.setSalario(2000);
        produccion.setSalario(4000);


    }

}
