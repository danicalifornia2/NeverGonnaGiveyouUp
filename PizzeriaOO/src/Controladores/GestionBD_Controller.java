
package Controladores;

import Modelo.Ingrediente;
import Utils.ConexionDB4O;
import Utils.DB4OException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pizzeriaoo.NuevoIngrediente;


public class GestionBD_Controller {
    
    //comprobar conectividad con la base de datos
    public boolean ComprobarBasedeDatos() throws DB4OException {
        ConexionDB4O.conectar();
        ConexionDB4O.desconectar();
        
        return true;
    }
    
    //Cambiar la ruta de la base de datos
    //Recibe como parametro la rurta que desee ingresar
    public void CambiarRutaBD(String Ruta){
        ConexionDB4O.rutabd = Ruta;
    }
    
    
    public static void Conectar(){
        try {
            ConexionDB4O.conectar();
        } catch (DB4OException ex) {
            Logger.getLogger(GestionBD_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void Desconectar(){
        try {
            ConexionDB4O.desconectar();
        } catch (DB4OException ex) {
            Logger.getLogger(GestionBD_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   
}
