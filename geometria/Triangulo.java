package geometria;

public class Triangulo {
    int base;
    int altura;
    public Triangulo() {
        base = 0;
        altura = 0;
    }
    public int area(int base, int altura){
        return (base*altura)/2;
    }
}