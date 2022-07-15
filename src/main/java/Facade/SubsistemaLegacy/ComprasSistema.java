/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.SubsistemaLegacy;

import Facade.Clients;
import Facade.Compras;
import Facade.Facturas;
import Facade.Product;



/**
 *
 * @author CAELOS JR 2018
 */
public class ComprasSistema {

    public ComprasSistema() {
    }
    

    public Compras generateCompra (Clients Client,Product comprado){
        // se genera la factura en base a la compra
        Compras compras = new Compras(comprado);
        return compras;
    }    
    
}
