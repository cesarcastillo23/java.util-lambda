package com.bank.Test;

import com.bank.modelo.Cliente;
import com.bank.modelo.Cuenta;
import com.bank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Cliente> listaCliente =new ArrayList<>();
        List<Cuenta> lista = new ArrayList<>();
        CuentaCorriente cc =new CuentaCorriente(11,22);
        CuentaCorriente cc2 =new CuentaCorriente(14,25);
        CuentaCorriente cc3 =new CuentaCorriente(16,25);
        CuentaCorriente cc4 =new CuentaCorriente(12,25);
        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i=0 ; i< lista.size();i++){
           // System.out.println(lista.get(i));
           // System.out.println("----------------------");
        }

        for(Cuenta cuenta:lista){
           // System.out.println(cuenta);
        }
        boolean contiene= lista.contains(cc3);


        if (contiene){
            System.out.println("Si es igual");
        }

    }
}
