// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //resultado de la función
        int resultadoSuma = funcionSuma.suma(4, 6, 4);
        System.out.println("el total de la suma es= " + resultadoSuma);

        //resultado de la clase
        claseCoche coche = new claseCoche();
        System.out.println("Número de puetas del coche: " + coche.numeroDePuertas);
        coche.añadirPuerta(4);
        System.out.println("Número de puetas del coche: " + coche.numeroDePuertas);

    }
}