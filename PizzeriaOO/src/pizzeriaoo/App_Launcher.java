package pizzeriaoo;

import Controladores.GestionBD_Controller;
import Modelo.Ingrediente;
import Utils.ConexionDB4O;
import com.db4o.ObjectSet;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Utils.ConexionDB4O.bd;
import Utils.DB4OException;
import Vistas.GestionBD;

public class App_Launcher {

    public static void main(String[] args) {

        /*
    String filePath = new File("").getAbsolutePath();
    
    String Ruta = filePath.concat("\\datos\\baseDatos.pizza");
            
    ConexionDB4O testbd4O = new ConexionDB4O(Ruta);   
        
        try {
            testbd4O.conectar();
        } catch (DB4OException ex) {
            Logger.getLogger(App_Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            testbd4O.desconectar();
        } catch (DB4OException ex) {
            Logger.getLogger(App_Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        */
        
        //Configurar la base de datos
        
        GestionBD frame = new GestionBD();
        frame.setVisible(true);
                
        GestionBD_Controller.Conectar();
        
        GestionIngredientes win = new GestionIngredientes();
        win.setVisible(true);
        
        GestionBD_Controller.Desconectar();
        
        /*
        
        --Insertar un objeto
        try {
            ConexionDB4O.conectar();
            Ingrediente uno = new Ingrediente("KI", "Kiwi", 2.0f, "Un kiwi de locos");
            ConexionDB4O.bd.store(uno);
            ConexionDB4O.desconectar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la BBDD", "Muy Mal", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Conexion exitosa con la BBDD", "Exito", JOptionPane.INFORMATION_MESSAGE);
         */
        
        
        //Consultar la base de datos :)
        /*
        Ingrediente iQBE = new Ingrediente();
        iQBE.codigo = "KI";
        try {
            ConexionDB4O.conectar();
            
            //Especificamos el tipo derivado para poder acceder a los diferentes atributos
            //Devuelve todos los ingredientes que tengamos guardados que tengan codigo BE
            
            ObjectSet<Ingrediente> os = ConexionDB4O.bd.queryByExample(iQBE);
            
            DefaultTableModel datos = (DefaultTableModel) tbIngredientes.getModel();
            
            datos.setRowCount(0);
            for (Ingrediente i: os) {
                ArrayList<String> Fila = new ArrayList<String>();
                Fila.add(i.codigo);
                Fila.add(i.nombre);
                Fila.add(String.valueOf(i.precio));
                Fila.add(i.comentarios);
                datos.addRow(Fila.toArray());
                System.out.println(i.nombre);
            }
            ConexionDB4O.desconectar();
        } catch (Exception ex) {
            Logger.getLogger(PruebaOO.class.getName()).log(Level.SEVERE, null, ex);
*/
        }
    
    }


