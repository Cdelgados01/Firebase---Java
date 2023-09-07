
package com.mycompany.firebase01;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    
    private String nombre;
    private int edad;
    private int documento;

    // Constructores, getters y setters

    public Usuario() {
        // Constructor vacío requerido para Firebase
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    

}
