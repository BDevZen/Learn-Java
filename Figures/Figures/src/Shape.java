// Clase abstrata que representa las bases de figuras geometricas
public abstract class Shape implements Formulas{

    // Metodo abstracto que necesitan implementar las clases hijas
    public abstract String type();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
