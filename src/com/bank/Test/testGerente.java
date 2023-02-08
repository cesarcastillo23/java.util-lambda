package com.bank.Test;

import com.bank.modelo.gerente;

public class testGerente {
    public static void main(String[] args) {
        gerente cesar = new gerente();
         cesar.setSalario(3000);
//        funcionario cesar =new funcionario();
        cesar.setTipo(1);
        cesar.setClave("alura");
        System.out.println(cesar.getBonificacion());
        System.out.println(cesar.getSalario());
        System.out.println(cesar);
        System.out.println(cesar.iniciarSesion("alua"));
    }
}
