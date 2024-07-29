public class TypeSMS implements Notify{
    //Se implementa el método de la interfaz para un tipo de notificación en especial
    @Override
    public void send(String message) {
        System.out.println("Enviando notificación por SMS con este mensaje; " + message);
    }
}