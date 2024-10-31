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
public class Administrador extends PersonaM{
     CocinaEconomica Eco = new CocinaEconomica();
     private ArrayList<Platillo> menu;
         String platillos;
         int precio;
         Scanner scanner= new Scanner(System.in);
    public Administrador() {
    }

    public Administrador(ArrayList<Platillo> menu) {
        this.menu = menu;
        
    }

    public Administrador(ArrayList<Platillo> menu, String platillos, int precio) {
        this.menu = menu;
        this.platillos = platillos;
        this.precio = precio;
    }

    public Administrador(ArrayList<Platillo> menu, String platillos, int precio, String nombre, int id, String teléfono) {
        super(nombre, id, teléfono);
        this.menu = menu;
        this.platillos = platillos;
        this.precio = precio;
    }

     
     public void AdmMenu(){
       
        int num;
        System.out.println("1.-Ver ingredientes");
        System.out.println("2.-Anadir ingrediente");
        System.out.println("3.-Eliminar ingrediente");
        System.out.println("4.-Ver platillos");
        System.out.println("5.-Anadir platillo");
        System.out.println("6.-Eliminar platillo");
        System.out.println("7.-Salir");
        num=scanner.nextInt();
        //llamo al metodomenuAdmi
       menuAdmi(num);
    }
    public int menuAdmi(int num){
        switch(num){
            case 1:
                
                //se llama el metodo donde tengo guardado los ingresientes
            break;
            case 2:
                System.out.println("HDadfdfaZZBDGBCV");
                //se llama el metodo donde me deje añadir ingresientes
            break;
            case 3:
                //se llama el metodo donde me deje eliminar ingresientes
                System.out.println("ttttttttttttttttttttttt");
            break;
            case 4:
                //se llama el metodo donde me deje ver los platillos
                 mostrarMenu();
            break;
            case 5:
                System.out.print("Ingresa el nombre del nuevo platillo: ");
                String nombrePlatillo = scanner.nextLine();
                System.out.print("Ingresa el precio del platillo (como entero): ");
                int precio = scanner.nextInt(); // Lee el precio como int
                scanner.nextLine(); // Limpia el buffer
                Platillo nuevoPlatillo = new Platillo("hola", 1, true, "salsa");
                // Llama al método pasando el nuevo platillo
                agregarPlatillo(nuevoPlatillo);
              
            break;
            case 6:
                System.out.print("Ingresa el nombre del platillo a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                // Llama al método pasando el nombre del platillo
                eliminarPlatillo(nombreEliminar); 
            break;
            case 7:
                Eco.menu();
                break;
            default:
                System.out.println("Esa opcion no existe");
        }
        return 0;
    }
     //METODO PARA AÑADIR UN PLATILLO AL MENU
    public void agregarPlatillo(Platillo nuevoPlatillo) {
        menu.add(nuevoPlatillo);
        System.out.println("Platillo añadido: " + nuevoPlatillo.getNombre());
    }
     //METODO PARA MOSTRAR EL MENU
    public void mostrarMenu() {
        for (Platillo platillo : menu) {
            System.out.println("Platillo: " + platillo.getNombre() + " - Precio: $" + platillo.getPrecio());
        }
    }
     //METODO PARA ELIMINAR UN PLATILLO AL MENU
    // Método para eliminar un platillo
    public void eliminarPlatillo(String nombrePlatillo) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getNombre().equalsIgnoreCase(nombrePlatillo)) {
                menu.remove(i);
                System.out.println("Platillo eliminado: " + nombrePlatillo);
                return;
            }
        }
        System.out.println("Platillo no encontrado: " + nombrePlatillo);
    }

    
    
}
