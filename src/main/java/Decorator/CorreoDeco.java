    package Decorator;

public class CorreoDeco extends BaseDecorator{
    public CorreoDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
