package geometria;

public class Cuadrado extends Figura {
    int lado;
    public Cuadrado(){
        lado = 0;
    }
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public int area() {
        return lado*lado;
    }
}