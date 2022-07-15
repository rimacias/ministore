/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.SubsistemaLegacy;

import Facade.Clients;
import Facade.Compras;
import Facade.Facturas;
import java.util.ArrayList;

/**
 *
 * @author CAELOS JR 2018
 */
public class BaseDeDatos {
    private static ArrayList<Clients> ListClientes;
    private static ArrayList<Facturas> ListFacturas;
    private static ArrayList<Compras> ListCompras;

    public BaseDeDatos(ArrayList<Clients> ListClientes, ArrayList<Facturas> ListFacturas, ArrayList<Compras> ListCompras) {
        this.ListClientes = ListClientes;
        this.ListFacturas = ListFacturas;
        this.ListCompras = ListCompras;
    }
    

    public static ArrayList<Clients> getListClientes() {
        return ListClientes;
    }

    public static ArrayList<Facturas> getListFacturas() {
        return ListFacturas;
    }

    public static ArrayList<Compras> getListCompras() {
        return ListCompras;
    }

    public static void setListClientes(ArrayList<Clients> ListClientesa) {
        ListClientes = ListClientesa;
    }

    public static void setListFacturas(ArrayList<Facturas> ListFacturasa) {
        ListFacturas = ListFacturasa;
    }

    public static void setListCompras(ArrayList<Compras> ListComprasa) {
        ListCompras = ListComprasa;
    }
    
    public static boolean ValidateValores(Clients cliente){
        //se valida si la informacion del cliente es real 
        return false;
    }
    
    
}
