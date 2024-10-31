/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocinaeconomica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fatyp
 */
public class Platillo {
     
    private String nombre;
    private int precio;
    private boolean  disponibilidad;
    private String ingrediente;
    private ArrayList<Ingrediente> ingredientes;
    Scanner scanner = new Scanner(System.in);
   public Platillo() {
        ingredientes = new ArrayList<>(); // Inicializa la lista de ingredientes
    }
   
    public static void Menu(){
         
        System.out.println("==========MENU==========");
        System.out.println("1.-Chiles rellenos");
        System.out.println("2.-Spagueti");
        System.out.println("3.-Enfrijoladas");
        System.out.println("4.-Enchiladas");
        System.out.println("5.-Quesadillas");   

       // System.out.println("");
    }

    

    public Platillo(String nombre, int precio, boolean disponibilidad, String ingrediente) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.ingrediente = ingrediente;
        this.ingredientes = new ArrayList<>(); // Inicializa la lista de ingredientes

    }

    //METODO PARA AÑADIR UN INGREDIENTE
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        System.out.println("Ingrediente añadido: " + ingrediente.getNombre());
    }
    //METODO PARA ELIMINAR UNGREDIENTES
    public void eliminarIngrediente(String nombreIngrediente) {
        ingredientes.removeIf(ingrediente -> ingrediente.getNombre().equalsIgnoreCase(nombreIngrediente));
        System.out.println("Ingrediente eliminado: " + nombreIngrediente);
    }
    //METODO PARA MOSTRARA INGREDIENTES
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de " + nombre + ":");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre() + ": " + ingrediente.getCantidad());
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    

    
     /*Platillo(String nombrePlatillo, int precio) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
}
