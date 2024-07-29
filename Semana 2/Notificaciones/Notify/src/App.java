public class App {
    //Implementamos un Excepcion para arrojar a consola un error en caso de que se presentará
    public static void main(String[] args) throws Exception {
        // Crear la instancia del objeto de cada tipo de Notify
        Notify notify = new TypeEmail();
        // Realizamos la inyección desde el servicio
        Service emailService = new Service(notify);
        emailService.notifyUser("Has recibido un mensaje vía correo");

        // Creamos otra instancia del objeto ahora para otro tipo de Notify
        Notify notify2 = new TypeSMS();
        Service smsService = new Service(notify2);
        smsService.notifyUser("Has recibido un mensaje vía SMS");
    }
}