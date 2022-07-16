/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author ramon
 */
public class WhatsappDeco extends BaseDecorator{
    public WhatsappDeco(Notifier noti){
        super(noti);
    }
    @Override
    public void enviar(String mensaje){
        System.out.println("x: DEBE CANCELAR LA DEUDA");
    }
}
