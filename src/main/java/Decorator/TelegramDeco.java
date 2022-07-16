package Decorator;

public class TelegramDeco extends BaseDecorator{
    public TelegramDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
