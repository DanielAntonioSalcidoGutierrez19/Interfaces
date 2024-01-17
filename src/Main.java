public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultadoSum = calculadora.suma(5, 10);
        int resultadoRest = calculadora.resta(5, 1);
        int resultadoMult = calculadora.multiplicacion(5, 6);
        int resultadoDiv = calculadora.division(22, 2);
        int resultadoOperadoresJuntos = calculadora.suma(2, 6) - calculadora.resta(10, 7)* calculadora.multiplicacion(2,1)/ calculadora.division(2, 1);
        System.out.println("Suma: " + resultadoSum);
        System.out.println("Resta: " + resultadoRest);
        System.out.println("Multiplicación: " + resultadoMult);
        System.out.println("División: " + resultadoDiv);
        System.out.println("Operadores Juntos: " + resultadoOperadoresJuntos);
    }}
class Calculadora implements OperacionesMatematicas {
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir");
            return 0;
        }
    }
}
interface OperacionesMatematicas {
    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);
}