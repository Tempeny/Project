package com.gestorcontactos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void listaContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado: " + contacto.getNombre());
    }

    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void todosContactos() {
        System.out.println("Total de contactos: " + contactos.size());
    }
}
