/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Ingrediente {
    public String codigo;
    public String nombre;
    public float precio;
    public String comentarios;

    
           
    public Ingrediente(String Codigo, String Nombre, float Precio, String Comentarios) {
        this.codigo = Codigo;
        this.nombre = Nombre;
        this.precio = Precio;
        this.comentarios = Comentarios;
    }
   
   public Ingrediente() {
       super();
    }
            
}
 
