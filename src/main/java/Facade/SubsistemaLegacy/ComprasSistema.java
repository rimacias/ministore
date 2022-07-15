/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.SubsistemaLegacy;

import Facade.Clients;
import Facade.Compras;
import Facade.Product;



/**
 *
 * @author CAELOS JR 2018
 */
public class ComprasSistema {
    private Compras CompraAct;

    public Compras getCompraAct() {
        return CompraAct;
    }

    public void setCompraAct(Compras CompraAct) {
        this.CompraAct = CompraAct;
    }
    
    private Compras generateCompra(Clients Client,Product comprado){
        // se genera una compra y se la devuelve
        Compras compras = new Compras(comprado);
        return compras;
    }    
    
}
