
package Modelo;

import java.util.ArrayList;


public class Pedido {
    //Datos del cliente
    public String codPedido;
    public String NombreCliente;
    public String Direccion;
    public String Telefono;
    
    //Precio y descuentos que se le aplica a la pizza
    public double PrecioTotal;
    public double PrecioSinIva;
    public double Descuento;
    
    //Gestion del pedido a domicilio
    public boolean Cambio; //Indica si el repartidor debe llevar cambio
    public double CambiodeCuanto; //Indica el billete de cambio
    
    public ArrayList<Pizza> pizzitas;
            
    public Pedido(){
    pizzitas = new ArrayList<Pizza>();
    }
    
    
}
