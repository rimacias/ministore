    package Decorator;

public class SignalDeco extends BaseDecorator{
    public SignalDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
