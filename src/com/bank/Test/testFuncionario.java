package com.bank.Test;

import com.bank.modelo.contador;
import com.bank.modelo.funcionario;

public class testFuncionario {
    public static void main(String[] args) {
        funcionario diego= new contador();
        diego.setNombre("diego");
        diego.setDocumento("1555663366");
        diego.setSalario(2000);
        diego.setTipo(0);
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
