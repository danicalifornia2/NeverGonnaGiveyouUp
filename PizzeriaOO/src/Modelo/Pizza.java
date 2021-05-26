package Modelo;

import java.util.ArrayList;

public class Pizza {

    public String codPizza;
    public String masa;
    public double precio;
    public String comentatios;

    public ArrayList<Ingrediente> ingredientes;

    public Pizza() {

        ingredientes = new ArrayList<Ingrediente>();
    }

}
