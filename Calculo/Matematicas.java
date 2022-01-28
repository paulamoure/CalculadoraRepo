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
