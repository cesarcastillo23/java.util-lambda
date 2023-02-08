package com.bank.modelo;

public class control {
    private double suma;
    public double registrarSalario(funcionario funcionario){
        this.suma=funcionario.getBonificacion()+this.suma;
        System.out.println("calculo actual es: " + this.suma);
        return this.suma;
    }
//    public double registrarSalario(gerente gerente){
//        this.suma=gerente.getBonificacion()+this.suma;
//        System.out.println("calculo actual es: " + this.suma);
//        return this.suma;
//    }

}
