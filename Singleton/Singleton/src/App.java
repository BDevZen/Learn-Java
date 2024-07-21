// Paqueterias importadas para su funcionamiento
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase main de la logica
public class App {
    public static void main(String[] args) throws Exception {
        // Declaración de un ArrayList
        List<Party> parties = new ArrayList<>();

        // Creación e inicialización de instancias de la clase Party
        Party party0 = new Party("Santiago");
        Party party1 = new Party("Ernesto");
        Party party2 = new Party("Humberto");

        // Se agrega los valores hacia el StringBuilder de la clase Party
        party0.getParty().append("PRD");
        party1.getParty().append("PAN");
        party2.getParty().append("PRI");

        // Se agregan para almacenar las instancias a un ArrayList 
        parties.add(party0);
        parties.add(party1);
        parties.add(party2);

        // Obtener la unica instancia de President (Singleton)
        President president = President.getInstance();
        // Seleccionamos aleatoreamente nuestro proximo presidente
        Party win = winner(parties);
        // Imprimimos nuestro ganador de la contienda
        System.out.println(president.result() + win.getName() + " from: " + win.getParty());
    }

    /** Metodo creado para seleccionar aleatoreamente un candidato a traves de la lista
     * @param parties => Lista que contiene las instancias de Party 
     * @return Una instancia de Party ganadora aleatoreamente
     */
    private static Party winner(List<Party> parties) {
        // Validamos si esta vacia la lista
        if (parties.isEmpty()) {
            return null;
        }
        // Creamos e inicializamos la instancia random para generar numeros aleatoreamente
        Random random = new Random();
        // Inizializamos la variable index apuntando al objeto de referencia del tamaño de la lista
        int index = random.nextInt(parties.size());
        // Devolvemos el elemento de la lista de la posicion seleccionada aleatoreamente
        return parties.get(index);
    }
}
