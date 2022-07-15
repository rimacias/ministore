/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author CAELOS JR 2018
 */
public class Movil {
    private Integer IMEI;
    private Clients cliente;
    
    
    public void buy(){
        //se pide un producto al usuario
        Product producto = new Product("papa");
        ShopFacade comprador = new ShopFacade();
        comprador.ProcessPurchase(producto, this.cliente);
    }
        
    public void Consult(){
        ShopFacade comprador = new ShopFacade();
        comprador.ConsultFactures(cliente);
    }

    
}
