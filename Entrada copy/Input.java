package Entrada;
import java.util.Scanner;

public class Input {
    public static int pedirNumero(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int operando=leer.nextInt();
        //poner int antes es una declaración (o String, etc)
        return operando;
    }
}