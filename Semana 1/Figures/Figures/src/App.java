// Clase main para probar el programa
public class App {
    public static void main(String[] args) throws Exception {
        // Declaracación e inicialización de variables de referencias guardas en un arreglo
        Shape[] shape = new Shape[] {new Square(5),
                                   new Triangle(4, 6, 8),
                                   new Circule(10)
        };
        // Invocación de método para inicizalizar con el arreglo
        show(shape);
    }
    /**
     * Metodo para mostrar todo la información de las figuras
     * @param s Recorre el arreglo de formas geometricas
     */
    public static void show(Shape[] s){
        // Polimorfismo
        for (Shape shape : s) {
            System.out.println(shape.toString() + ", your perimeter is: " 
            + shape.perimeter() + " and your area is: " + shape.area() + "type: " + shape.type());
        }
    }
}
