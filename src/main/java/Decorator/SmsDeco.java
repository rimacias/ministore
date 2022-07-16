    package Decorator;

public class SmsDeco extends BaseDecorator{
    public SmsDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
