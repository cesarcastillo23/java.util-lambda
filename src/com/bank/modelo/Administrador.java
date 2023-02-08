package com.bank.modelo;
public class Administrador extends funcionario implements Autenticable {

    private AutenticacionUtil util;

    public Administrador(){
        this.util=new AutenticacionUtil();
    }
    @Override
    public double getBonificacion() {

        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
