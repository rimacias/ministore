/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.SubsistemaLegacy;

import Facade.Compras;
import Facade.Facturas;


/**
 *
 * @author CAELOS JR 2018
 */
public class Facturador {

    public Facturador() {
    }
    
    public Facturas GenerateFactura (Compras compra){
        // se genera la factura en base a la compra
        Facturas facturas = new Facturas("$22");
        return facturas;
    }
    
}
