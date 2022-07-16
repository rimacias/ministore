package Facade;

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

    public void buy() {
        //se pide un producto al usuario
        Product producto = new Product("papa");
        ShopFacade comprador = new ShopFacade();
        comprador.ProcessPurchase(producto, this.cliente);
    }

    public void Consult() {
        ShopFacade comprador = new ShopFacade();
        comprador.ConsultFactures(cliente);
    }
}
