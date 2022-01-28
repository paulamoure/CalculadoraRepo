package Validation;

public class Validator {
    public static boolean noEsOpcionValida(int opcion){
        return opcion < 1 || opcion > 7;
    }
    public static boolean esIgual0(int num) {
        return num == 0;
    }
    public static boolean userNoQuiereSalir(int opcion) {
        return opcion != 7;
    }
}