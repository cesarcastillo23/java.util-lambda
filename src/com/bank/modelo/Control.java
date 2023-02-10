package com.bank.modelo;

public class Control {
    private double suma;
    public double registrarSalario(Funcionario funcionario){
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
