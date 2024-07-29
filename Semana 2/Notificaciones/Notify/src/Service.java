public class Service {
    //Aquí se realiza la inyección de dependencia de notificaciones
    private Notify notify;

    // El constructor recibe la dependencia de la interfaz sin necesidad de implementar
    public Service(Notify notify){
        this.notify = notify;
    }

    // Metodo para invocar a otras clases con un mensaje en concreto
    public void notifyUser(String message){
        notify.send(message);
    }
}