package Facade;
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
