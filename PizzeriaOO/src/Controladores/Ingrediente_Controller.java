/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.*;
import Utils.ConexionDB4O;
import static Utils.ConexionDB4O.bd;
import Utils.DB4OException;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import pizzeriaoo.NuevoIngrediente;

/**
 *
 * @author Usuario
 */
public class Ingrediente_Controller {
    //Listado de ingredientes
    
    /**
     * Obtiene un listado de ingredientes
     * @return un conjunto de objetos Ingredientes
     * @throws DB4OException 
     */
    public ObjectSet<Ingrediente> getListado() throws DB4OException {
        
        ObjectSet<Ingrediente> result; //Devolver el resultado de la funcion
        
        Ingrediente iQBE = new Ingrediente();
        
        result = ConexionDB4O.bd.queryByExample(iQBE);
        
        
        return result;
    }

        
    
    public Ingrediente getIngrediente(String Nombre) throws Exception{
        
    Ingrediente resul = null;
    
    Ingrediente iQBE = new Ingrediente();//objeto para la busqueda en la base de datos
    
    iQBE.nombre = Nombre;
    
   
    ObjectSet<Ingrediente> listado = ConexionDB4O.bd.queryByExample(iQBE);
        if (listado.hasNext()) {
            resul = listado.next();
        }else{
            throw new Exception("No hay ningun ingrediente en la búsqueda");
        }
   
    
    return resul;
    }
    
     public void AniadirIngrediente(){
        
        NuevoIngrediente g = new NuevoIngrediente();
        
        String idIngrediente = g.tfCodigo.getText();
        String Nombre = g.tfNombre.getText();
        String Precio = g.tfPrecio.getText();
        String Comentarios = g.tfComentarios.getText();
        
        
        try {
          
            Ingrediente d = new Ingrediente(
                    idIngrediente, 
                    Nombre, 
                    Float.parseFloat(Precio), 
                    Comentarios);
    
            ConexionDB4O.bd.store(d);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido añadir un ingrediente", "Muy Mal", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Ingrediente añadido con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
