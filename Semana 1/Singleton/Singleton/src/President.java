// Singleton llamado President
public class President {
    // Declaramos la varable de instancia Singleton
    private static President president = new President();
    
    private President(){}

    // Metodo para acceder a la instancia del Singleton
    public static President getInstance(){
        if (president == null) {
            president = new President();
        }
        return president;
    }

    // Metodo para invocar desde el main class
    public String result(){
        return "The next president is: ";
    }
}