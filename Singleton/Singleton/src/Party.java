// Clase llamada Party
public class Party {
    // Variables de referencias declaradas
    private StringBuilder party;
    private String name;

    public Party(String name){
        this.name = name;
        this.party = new StringBuilder();
    }
    // Getters & Setters de las variables
    public StringBuilder getParty(){
        return party;
    }
    public void setParty(StringBuilder name){
        this.party = party;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
