package Calculo;
import geometria.*;
import operations.*;
public class Matematicas {
    public static int sumar(int sumando1, int sumando2){
        Operacion sum = new Sum(sumando1, sumando2);
        return sum.operar();
    }
    public static int restar(int minuendo, int sustraendo){
        Operacion resta = new Resta(minuendo, sustraendo);
        return resta.operar();
    }
    public static int multiplicar(int multiplicando, int multiplicador){
        Operacion multiplicar = new Multiplicar(multiplicando, multiplicador);
        return multiplicar.operar();
    }
    public static int dividir(int dividendo, int divisor){
        Operacion division = new Division(dividendo, divisor);
        return division.operar();
    }
    public static int calcularAreaTriangulo(int base, int altura){
        Figura triangulo = new Triangulo(base, altura);
        return triangulo.area();
    }
    public static int calcularAreaCuadrado(int lado){
        Figura cuadrado = new Cuadrado(lado);
        return cuadrado.area();
    }
}
