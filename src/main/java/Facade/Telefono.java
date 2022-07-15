/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author CAELOS JR 2018
 */
public class Telefono {
    private Integer Numero;
    private Clients cliente;
    
    public void Consult(){
        ShopFacade comprador = new ShopFacade();
        comprador.ConsultFactures(cliente);
    }
}
