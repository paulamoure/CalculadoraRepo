package operations;

public class Sum extends Operacion{
    int sumando1;
    int sumando2;
    public Sum(){
        sumando1 = 0;
        sumando2 = 0;
    }
    public Sum(int sumando1, int sumando2){
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
    }
    public int operar(){
        int suma = sumando1 + sumando2; 
        return suma;
    }
}