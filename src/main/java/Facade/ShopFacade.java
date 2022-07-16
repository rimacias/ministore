/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Facade.SubsistemaLegacy.BaseDeDatos;
import Facade.SubsistemaLegacy.ComprasSistema;
import Facade.SubsistemaLegacy.Facturador;
import java.util.ArrayList;

public class ShopFacade implements IFacade {
    public ShopFacade() {
    }
    public  void ProcessPurchase(Product producto,Clients cliente) {
        System.out.println("Comenzo la compra");
        boolean ValidateValores = BaseDeDatos.ValidateValores(cliente);
        if(ValidateValores){
            Compras compraa = (new ComprasSistema()).generateCompra(cliente, producto);
            Facturas fact = (new Facturador()).GenerateFactura(compraa);
            ArrayList<Facturas> listFacturas = BaseDeDatos.getListFacturas();
            listFacturas.add(fact);
            BaseDeDatos.setListFacturas(listFacturas);
            ArrayList<Compras> listCompras = BaseDeDatos.getListCompras();
            listCompras.add(compraa);
            BaseDeDatos.setListCompras(listCompras);    
        }else{
            System.out.println("no se puede validar");
        }
        //Se valida y se crea compra
        //Se crea factura y se guarda en la base de datos (lista de facturas)
    }
    public  void ConsultFactures(Clients cliente) {
        System.out.println("Se muestran facturas");
        boolean ValidateValores = BaseDeDatos.ValidateValores(cliente);
        if(ValidateValores){
            ArrayList<Facturas> listFacturas = BaseDeDatos.getListFacturas();
            for(Facturas f: listFacturas){
                System.out.println(f);
            }
        }
        // Se valida por metodo de validate
        // Luego se muestra las facturas usando la base de datos
    }
}