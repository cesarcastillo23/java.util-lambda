package com.bank.Test;

import com.bank.modelo.Gerente;

public class TestGerente {
    public static void main(String[] args) {
        Gerente cesar = new Gerente();
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
