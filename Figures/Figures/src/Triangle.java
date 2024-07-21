// Clase hija que extiende a la clase Shape y al mismo tiempo implementa la interfaz
public class Triangle extends Shape{
    // Variables de referencia de triangulo
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementacion de metodos de la interfaz Formulas
    @Override
    public double area() {
        double total = sideA + sideB + sideC;
        return total / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Implementacion de metodos de la clase abstracta Shape
    @Override
    public String toString() {
        return "This shape is: " + super.toString();
    }

    @Override
    public String type() {
        return "Line";
    }
}
