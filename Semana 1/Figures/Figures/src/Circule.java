// Clase hija que extiende a la clase Shape y al mismo tiempo implementa la interfaz
public class Circule extends Shape{
    
    // Variable de referencia declarada
    protected double radius;

    public Circule(double radius){
        this.radius = radius;
    }

    // Implementacion de metodos de la interfaz Formulas
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2); 
    }

    @Override
    public double perimeter() {
        return Math.PI * (radius * 2);
    }

    // Implementacion de metodos de la clase abstracta Shape
    @Override
    public String toString() {
        return "The shape is: " + super.toString();
    }

    @Override
    public String type() {
        return "Curve";
    }
}
