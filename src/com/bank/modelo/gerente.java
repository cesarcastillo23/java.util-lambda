package com.bank.modelo;

public class gerente extends funcionario implements Autenticable{


    public double getBonificacion(){
        return 2000+this.getSalario()*0.5;
    }
    @Override
    public void setClave(String clave) {
    }
    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
