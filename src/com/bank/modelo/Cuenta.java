package com.bank.modelo;

import com.bank.Test.SaldoInsuficienteException;

/**
 *
 */

public abstract class Cuenta {

            private int agencia;
            private int numero;
            protected double saldo;
            private Cliente titular=new Cliente();

            private static int total=0;

            public Cuenta(int agencia,int numero){
                if(agencia<=0){
                    System.out.println("No se permiten 0");
                    this.agencia=1;
                }else {
                    this.agencia=agencia;
                    total++;
                    System.out.println("se han creando: "+total+" en total");
                }

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


        }








