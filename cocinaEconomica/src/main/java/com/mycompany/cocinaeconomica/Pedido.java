/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocinaeconomica;

/**
 *
 * @author Fatyp
 */
public class Pedido {
    int numPedido;
    String pedido;
    int total;

    public Pedido() {
    }

    public Pedido(int numPedido, String pedido, int total) {
        this.numPedido = numPedido;
        this.pedido = pedido;
        this.total = total;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
