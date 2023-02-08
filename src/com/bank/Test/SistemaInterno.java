package com.bank.Test;

import com.bank.modelo.Autenticable;

public class SistemaInterno {
    private String clave;

    public boolean autentica(Autenticable gerente){


        boolean puedeIniciarSesion= gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("login exitoso");
            return true;
        }else{
            System.out.println("Error en login");
            return false;

        }
    }


}
