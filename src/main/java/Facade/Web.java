/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author CAELOS JR 2018
 */
public class Web {
    private Integer IP;
    private Clients cliente;

    public Integer getIP() {
        return IP;
    }

    public Clients getCliente() {
        return cliente;
    }

    public void setIP(Integer IP) {
        this.IP = IP;
    }

    public void setCliente(Clients cliente) {
        this.cliente = cliente;
    }

    public Web(Integer IP, Clients cliente) {
        this.IP = IP;
        this.cliente = cliente;
    }
    
    public void buy(Product producto){
    //se compra
    }
}
