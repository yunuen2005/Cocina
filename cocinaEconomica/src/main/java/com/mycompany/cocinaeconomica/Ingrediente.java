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
public class Ingrediente extends PersonaM{
    int cantidad;
    Scanner scanner = new Scanner(System.in);
    public int MenuIngredientes(){
        int r;
        System.out.println("==========MENU==========");
        System.out.println("1.-Chiles rellenos");
        System.out.println("2.-Spagueti");
        System.out.println("3.-Enfrijoladas");
        System.out.println("4.-Enchiladas");
        System.out.println("5.-Quesadillas");
        r=scanner.nextInt();
        
        switch(r){
            case 1:
                System.out.println("chiles poblanos");
                System.out.println(" ranchjero queso");
                System.out.println("jitomate");
                System.out.println("ajo");
                System.out.println("pedacito cebolla");
                System.out.println("Huevos");
            break;
            case 2:
                System.out.println("Pasta");
                System.out.println("Jitomate");
                System.out.println("pedacito cebolla");
                System.out.println(" ranchjero queso");
                System.out.println("ajo");
                System.out.println("");
            break;
            case 3:
                System.out.println("sfgvsfvs");
            break;
            case 4:
                System.out.println("dgsfbsfsf");
            break;
            case 5:
                System.out.println("dfhdthzdgb");
            break;
            default:
                System.out.println("Esa opción no existe");
        }
        return r;
        
    }

    public Ingrediente() {
    }

    public Ingrediente(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
