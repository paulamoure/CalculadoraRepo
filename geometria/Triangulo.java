package geometria;

public class Triangulo extends Figura{
    int base;
    int altura;
    public Triangulo() {
        base = 0;
        altura = 0;
    }
    public Triangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int area(){
        return (base*altura)/2;
    }
}