package operations;

public class Multiplicar extends Operacion{
    int multiplicador;
    int multiplicando;
    public Multiplicar(){
        multiplicador = 0;
        multiplicando = 0;
    }
    public Multiplicar(int multiplicador, int multiplicando){
        this.multiplicador = multiplicador;
        this.multiplicando = multiplicando;
    }
    public int operar(){
        return multiplicando*multiplicador;
    }
}