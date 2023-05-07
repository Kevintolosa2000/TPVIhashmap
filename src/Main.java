import Punto1.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona p = new Persona("lu", 12,"m",74.0,1.80);

        System.out.printf(p.toString());
        System.out.printf("hola: "+ p.calcularIMC());
// Utilizar el dni como clave del hashmap
    }
}