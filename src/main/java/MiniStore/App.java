package MiniStore;
import FactoryMethod.CCbuilder;
import FactoryMethod.Cliente;
public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente1 = new Cliente("Ramón", "Macías",120000);
        Cliente cliente2 = new Cliente("Julio", "González",70000);
        Cliente cliente3 = new Cliente("Miguel","Nieto",30000);
        // se solicita asignar tarjetas de crédito a cada cliente
        CCbuilder ccProvider = new CCbuilder();
        cliente1.setCreditCard(ccProvider.genCardForClient(cliente1));
        cliente2.setCreditCard(ccProvider.genCardForClient(cliente2));
        cliente3.setCreditCard(ccProvider.genCardForClient(cliente3));
        // La clase constructora ha entregado a cada cliente su tarjeta correspondiente
    }
}
