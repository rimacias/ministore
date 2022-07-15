package MiniStore;

import FactoryMethod.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente1 = new Cliente("Ramón", "Macías",120000);
        Cliente cliente2 = new Cliente("Julio", "González",70000);
        Cliente cliente3 = new Cliente("Miguel","Nieto",30000);
    }
}
