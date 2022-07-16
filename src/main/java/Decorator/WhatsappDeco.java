    package Decorator;

public class WhatsappDeco extends BaseDecorator{
    public WhatsappDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
