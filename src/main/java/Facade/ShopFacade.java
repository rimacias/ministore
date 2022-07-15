/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Facade.SubsistemaLegacy.ComprasSistema;

/**
 *
 * @author CAELOS JR 2018
 */
public class ShopFacade implements IFacade {

    public ShopFacade() {
    }
          
    public  void ProcessPurchase(Product producto,Clients cliente) {
        System.out.println("Comenzo la compra");
        //se valida por metodo de validate, luego se crea la compra por medio del metodo generate compra 
        //luego se factura por medio de metodo  GenerateFactura y por ultimo se gurada en la base de datos
        //por el uso de los setters de la base de datos 
    }
    
    public  void ConsultFactures(Clients cliente) {
        System.out.println("Se muestran facturas");
        //se valida por metodo de validate, luego se muestra las facturas por medio de los getters de la
        //base de datos 
    }
    
}
