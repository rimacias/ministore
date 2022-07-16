    package Decorator;

public class WireDeco extends BaseDecorator{
    public WireDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
