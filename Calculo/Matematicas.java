package Calculo;
import geometria.*;
import operations.Sum;
import operations.Resta;
import operations.Multiplicar;
import operations.Division;
public class Matematicas {
    static Triangulo triangulo;
    static Cuadrado cuadrado;
    static Sum sum;
    static Resta resta;
    static Multiplicar multiplicar;
    static Division division;
    public static int sumar(int sumando1, int sumando2){
        sum = new Sum(sumando1, sumando2);
        return sum.operar();
    }
    public static int restar(int minuendo, int sustraendo){
        resta = new Resta(minuendo, sustraendo);
        return resta.operar();
    }
    public static int multiplicar(int multiplicando, int multiplicador){
        multiplicar = new Multiplicar(multiplicando, multiplicador);
        return multiplicar.operar();
    }
    public static int dividir(int dividendo, int divisor){
        division = new Division(dividendo, divisor);
        return division.operar();
    }
    public static int calcularAreaTriangulo(int base, int altura){
        triangulo = new Triangulo(base, altura);
        int area = triangulo.area();
        return area;
    }
    public static int calcularAreaCuadrado(int lado){
        cuadrado = new Cuadrado(lado);
        int area = cuadrado.area();
        return area;
    }
}
