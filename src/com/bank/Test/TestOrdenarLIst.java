package com.bank.Test;

import com.bank.modelo.Cliente;
import com.bank.modelo.Cuenta;
import com.bank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLIst {
    public static void main(String[] args) {
        Cuenta cc1=new CuentaCorriente(24,31);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
          cc1.depositar(383);
          Cuenta cc2=new CuentaCorriente(41,52);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Armando");
        cc2.setTitular(clienteCC2);
          cc2.depositar(373);
          Cuenta cc3=new CuentaCorriente(31,32);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Cesar");
        cc3.setTitular(clienteCC3);
          cc3.depositar(363);
          Cuenta cc4=new CuentaCorriente(11,38);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Carlos");
        cc4.setTitular(clienteCC4);
          cc4.depositar(353);

//        Cuenta cc1=new CuentaCorriente(21,32);
//        cc1.depositar(333);
//        Cuenta cc2=new CuentaCorriente(251,352);
//        cc2.depositar(200);
//        Cuenta cc3=new CuentaCorriente(241,342);
//        cc3.depositar(457);
//        Cuenta cc4=new CuentaCorriente(241,322);
//        cc4.depositar(457);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        System.out.println("antes");
        for(Cuenta cuenta:lista){
            System.out.println(cuenta);
        }


       // Comparator<Cuenta> comparator= new ordenadorCuentas();


        lista.sort( new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });


        System.out.println("Despues por numero");
        for(Cuenta cuenta:lista){
            System.out.println(cuenta);
        }


      //  Comparator<Cuenta> comparadorTitular=new ordenadorTitular();

//        lista.sort(new Comparator<Cuenta>() {
//            @Override
//            public int compare(Cuenta o1, Cuenta o2) {
//                return 0;
//            }
//        });
//        System.out.println("Despues 2");
//        for(Cuenta cuenta:lista){
//            System.out.println(cuenta);
//        }

        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return   o1.getTitular().getNombre().compareTo
                        (o2.getTitular().getNombre());
            }
        });
        System.out.println("Despues por con colle");
        for(Cuenta cuenta:lista){
            System.out.println(cuenta);

            }
        Collections.sort(lista);
        System.out.println("Despues por con orden natural");
        for(Cuenta cuenta:lista){
            System.out.println(cuenta);
        }
    }
}

//class ordenadorCuentas implements Comparator<Cuenta>{
//
//    @Override
//    public int compare(Cuenta o1, Cuenta o2) {
//          //  return o1.getNumero() - o2.getNumero();
//        //forma Wrapper
//        return Integer.compare(o1.getNumero(), o2.getNumero());
//    }
//}
//class ordenadorTitular implements Comparator<Cuenta>{
//
//    @Override
//    public int compare(Cuenta o1, Cuenta o2) {
//      return   o1.getTitular().getNombre().compareTo
//                (o2.getTitular().getNombre());
//    }
//}
