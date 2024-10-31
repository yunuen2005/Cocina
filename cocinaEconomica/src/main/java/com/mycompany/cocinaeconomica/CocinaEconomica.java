/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cocinaeconomica;

import java.util.Scanner;

/**
 *
 * @author Fatyp
 */
public class CocinaEconomica {
    

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();
        Administrador Admin = new Administrador();
        int num1;
        
        do{
            num1 = menu();
            switch(num1){
            case 1: //menu de administrador
                Admin.AdmMenu();
            break;
            case 2: //menu de Cliente
                cli.Menu();
            break;
            }
        }while(num1 != 3);
    }
    public static int menu(){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("===========BIENVENIDOS==========");
            //PREGUNTAR SI ES ADMINISTRADOR O CLIENTE
            System.out.println("Tu eres ...");
            System.out.println("1.-Administrador");
            System.out.println("2.-Cliente");
            System.out.println("3.-Salir");
            num = s.nextInt();
            return num;
    }
    }
    
