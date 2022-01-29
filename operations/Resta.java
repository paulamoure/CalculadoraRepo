package operations;

public class Resta extends Operacion{
    int minuendo;
    int sustraendo;
    public Resta(){
        minuendo = 0;
        sustraendo = 0;
    }
    public Resta(int minuendo, int sustraendo){
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
    }
    public int operar(){
        return minuendo - sustraendo;
    }
}