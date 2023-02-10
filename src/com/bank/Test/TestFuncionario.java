package com.bank.Test;

import com.bank.modelo.Contador;
import com.bank.modelo.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego= new Contador();
        diego.setNombre("diego");
        diego.setDocumento("1555663366");
        diego.setSalario(2000);
        diego.setTipo(0);
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
