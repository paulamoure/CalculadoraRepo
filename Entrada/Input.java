package Entrada;
import java.util.Scanner;

public class Input {

    private static int pedirEntero(){
        Scanner lector=new Scanner(System.in);
        int numero = lector.nextInt();
        //poner int antes es una declaración (o String, etc)
        return numero;
    }
    public static int pedirOperando(){
        return pedirEntero();
    }
    public static int pedirOpcion(){
        return pedirEntero();
    }
}