/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocinaeconomica;

/**
 *
 * @author Fatyp
 */
public class PersonaM {
   protected String nombre;
   protected int id;
   protected String teléfono;
  

    public PersonaM() {
    }

    public PersonaM(String nombre, int id, String teléfono) {
        this.nombre = nombre;
        this.id = id;
        this.teléfono = teléfono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    
    
    
}
