/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocinaeconomica;

import java.util.Scanner;

/**
 *
 * @author Fatyp
 */
public class Cliente extends PersonaM{
    
    
    private Ingrediente ing = new Ingrediente();
    private Platillo pla = new Platillo();
    Scanner scanner = new Scanner(System.in);

    public Cliente() {
    }

    public Cliente(String nombre, int id, String teléfono) {
        super(nombre, id, teléfono);
    }
    
    
    public void Menu(){
        int Res;
        System.out.println("1.-Ver platillos");
        System.out.println("2.-Ver ingredientes");
        System.out.println("3.-Salir");
        Res = scanner.nextInt();
        do{
        
        if(Res == 1){
            Platillo.Menu();
        }else if(Res == 2){
            ing.MenuIngredientes();
        }else if(Res == 3){
            
        }else{
            System.out.println("No existe esta opcion :D");
        }
        }while(Res != 3);
        
    }
   
    //Falta el carrito
   /* public void Carrito(){
        
    */
}

