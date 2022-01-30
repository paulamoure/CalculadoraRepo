package Calculo;
import geometria.*;
import operations.*;
public class Matematicas {
    private static int operar(Operacion operacion) {
        return operacion.operar();
    }
    private static int calcularArea(Figura figura) {
        return figura.area();
    }
    public static int sumar(int sumando1, int sumando2){
        Operacion sum = new Sum(sumando1, sumando2);
        return operar(sum);
    }
    public static int restar(int minuendo, int sustraendo){
        Operacion resta = new Resta(minuendo, sustraendo);
        return operar(resta);
    }
    public static int multiplicar(int multiplicando, int multiplicador){
        Operacion multiplicar = new Multiplicar(multiplicando, multiplicador);
        return operar(multiplicar);
    }
    public static int dividir(int dividendo, int divisor){
        Operacion division = new Division(dividendo, divisor);
        return operar(division);
    }
    public static int calcularAreaTriangulo(int base, int altura){
        Figura triangulo = new Triangulo(base, altura);
        return calcularArea(triangulo);
    }
    public static int calcularAreaCuadrado(int lado){
        Figura cuadrado = new Cuadrado(lado);
        return calcularArea(cuadrado);
    }
}
