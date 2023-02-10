package com.bank.Test;


import com.bank.modelo.*;

public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema= new SistemaInterno();
        Gerente gerente2=new Gerente();
        Administrador admin=new Administrador();
        Cliente cesar =new Cliente();

        sistema.autentica(gerente2);
        sistema.autentica(admin);

        //cesar.iniciarSesion("1234");
        sistema.autentica(cesar);



    }
}
