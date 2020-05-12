/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author USER
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INFORMACION CLIENTE");
        Usuario cliente1;
        cliente1 = new Usuario();
        cliente1.MostrarUsuario();
        System.out.println("INFORMACION DE VENTA");
        Venta venta1;
        venta1= new Venta();
        venta1.MostrarUsuario();
        System.out.println("INFORMACION PRODUCTO");
        Producto p1;
        p1 = new Producto();
        p1.MostrarUsuario();
    }
    
}
