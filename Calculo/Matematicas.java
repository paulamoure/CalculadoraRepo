package Calculo;
import geometria.Triangulo;
import geometria.Cuadrado;
public class Matematicas {
    static Triangulo triangulo;
    static Cuadrado cuadrado;
    public static int sumar(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }
    public static int restar(int minuendo, int sustraendo){
        return minuendo - sustraendo;
    }
    public static int multiplicar(int multiplicando, int multiplicador){
        return multiplicando * multiplicador;
    }
    public static int dividir(int dividendo, int divisor){
        return dividendo/divisor;
    }
    public static int calcularAreaTriangulo(int base, int altura){
        triangulo = new Triangulo();
        int area = triangulo.area(base, altura);
        return area;
    }
    public static int calcularAreaCuadrado(int lado){
        cuadrado = new Cuadrado();
        int area = cuadrado.area(lado);
        return area;
    }
}
