/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Facade.SubsistemaLegacy.*;
import java.util.ArrayList;

/**
 *
 * @author CAELOS JR 2018
 */
public class BaseDeDatos {
    private ArrayList<Clients> ListClientes;
    private ArrayList<Facturas> ListFacturas;
    private ArrayList<Compras> ListCompras;

    public ArrayList<Clients> getListClientes() {
        return ListClientes;
    }

    public ArrayList<Facturas> getListFacturas() {
        return ListFacturas;
    }

    public ArrayList<Compras> getListCompras() {
        return ListCompras;
    }

    public void setListClientes(ArrayList<Clients> ListClientes) {
        this.ListClientes = ListClientes;
    }

    public void setListFacturas(ArrayList<Facturas> ListFacturas) {
        this.ListFacturas = ListFacturas;
    }

    public void setListCompras(ArrayList<Compras> ListCompras) {
        this.ListCompras = ListCompras;
    }
    
    public boolean ValidateValores(Clients cliente){
        //se valida si la informacion del cliente es real 
        return false;
    }
    
    
}
