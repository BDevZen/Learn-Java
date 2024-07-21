// Clase hija que extiende a la clase Shape y al mismo tiempo implementa la interfaz
public class Square extends Shape{
    
    private double side;

    public Square(double side){
        this.side = side;
    }

    // Implementacion de metodos de la interfaz Formulas
    @Override
    public double perimeter() {
        return side * 4;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    // Implementacion de metodos de la clase abstracta Shape
    @Override
    public String toString() {
        return "The shape is: " + super.toString();
    }

    @Override
    public String type() {
        return "Line";
    }
}
