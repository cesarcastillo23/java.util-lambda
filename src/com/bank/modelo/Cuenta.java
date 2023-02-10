package com.bank.modelo;

import com.bank.Test.SaldoInsuficienteException;

import java.util.Comparator;

/**
 *
 */

public abstract class Cuenta implements Comparable<Cuenta> {

            private int agencia;
            private int numero;
            protected double saldo;
            private Cliente titular=new Cliente();

            private static int total=0;

            public Cuenta(int agencia, int numero ){
                this.agencia=agencia;
                this.numero=numero;
               // System.out.println("Estoy creando una cuenta "+this.numero);
                Cuenta.total++;

            }
            //Metodos
           public abstract void  depositar(double valor);
            public void retirar(double valor) throws SaldoInsuficienteException {
                   if(this.saldo< valor) {
                    throw new SaldoInsuficienteException("No tiene saldo");
                   }
                   this.saldo-=valor;
           }

            public boolean trasferir(double valor,Cuenta cuenta) {
                if(valor > 0 &&saldo>=valor){
                    try {
                        this.retirar(valor);
                    } catch (SaldoInsuficienteException e) {
                        throw new RuntimeException(e);
                    }
                    cuenta.depositar(valor);
                    return true;

                }else{
                    System.out.println("saldo insuficiente");
                    return false;
                }
            }

            public int getAgencia() {
                return agencia;
            }

            public int getNumero() {
                return numero;
            }

            public void setNumero(int numero) {
                this.numero = numero;
            }

            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }

            public Cliente getTitular() {
                return titular;
            }

            public void setTitular(Cliente titular) {
                this.titular = titular;
            }

            public double getSaldo(){

               return this.saldo;
            }

            public static int getTotal() {
                return total;
            }

            public static void setTotal(int total) {
                Cuenta.total = total;
            }

            public void setAgencia(int nuevaAgencia){

               if(nuevaAgencia>0) {
                   this.agencia = nuevaAgencia;
               }else {
                   System.out.println("no se permiten valores negativos");


               }


            }
            public String toString() {
                String cuenta = "Numero: " + this.numero +
                        ", Agencia: " + this.agencia+" y titular: "+
                        this.titular.getNombre();
                return cuenta;
            }

            @Override
            public boolean equals(Object obj){
                Cuenta cuenta =(Cuenta) obj;
           return this.agencia == cuenta.getAgencia() &&
                        this.numero == cuenta.getNumero();
            }
            @Override
            public int compareTo(Cuenta o){
               // return Integer.compare(this.agencia,o.getAgencia());
                return Double.compare(this.getSaldo(),o.getSaldo());
            }
        }
