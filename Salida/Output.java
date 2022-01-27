package Salida;

public class Output {
    public static void mostrarOpciones(){
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
    }
    public static void mostrarOperando(String operando){
        System.out.println("Introduzca el " + operando);
    }
    public static void mostrarResultado(int resultado){
        System.out.println("El resultado es: " + resultado);
    }
}