package Validation;

public class Validator {
    /**
     * @param limInferior
     * @param valor
     * @param limSuperior
     * @return true - si el valor es menor estricto que limInferior y
     *                si el valor es mayor estricto que limSuperior
     */
    public static boolean valorNoEstaEnRango(int limInferior, int valor, int limSuperior){
        return valor < limInferior || valor > limSuperior;
    }
    public static boolean esIgualA0(int num) {
        return num == 0;
    }
    public static boolean usuarioNoQuiereSalir(int opcion, int opcSalida) {
        return opcion != opcSalida;
    }
}