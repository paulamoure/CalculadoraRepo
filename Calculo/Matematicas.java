package Calculo;
import geometria.*;
import operations.*;
public class Matematicas {
    public static int sumar(int sumando1, int sumando2){
        Sum sum = new Sum(sumando1, sumando2);
        return sum.operar();
    }
    public static int restar(int minuendo, int sustraendo){
        Resta resta = new Resta(minuendo, sustraendo);
        return resta.operar();
    }
    public static int multiplicar(int multiplicando, int multiplicador){
        Multiplicar multiplicar = new Multiplicar(multiplicando, multiplicador);
        return multiplicar.operar();
    }
    public static int dividir(int dividendo, int divisor){
        Division division = new Division(dividendo, divisor);
        return division.operar();
    }
    public static int calcularAreaTriangulo(int base, int altura){
        Triangulo triangulo = new Triangulo(base, altura);
        int area = triangulo.area();
        return area;
    }
    public static int calcularAreaCuadrado(int lado){
        Cuadrado cuadrado = new Cuadrado(lado);
        int area = cuadrado.area();
        return area;
    }
}
