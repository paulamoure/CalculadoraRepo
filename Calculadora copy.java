import Validation.Validator;
import Entrada.Input;
import Salida.Output;
import Calculo.Matematicas;


public class Calculadora{
    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    //Declarar constantes
    public static void main (String[] args) {
        int opcion;
        do  {
            do {
                Output.mostrarOpciones();
                opcion = Input.pedirNumero();
            }while(Validator.noEsOpcionValida(opcion));
            switch(opcion){
                case SUMA:
                Output.mostrarOperando("sumando");
                int sumando1 = Input.pedirNumero();
                int sumando2 = Input.pedirNumero();
                int resultado = Matematicas.sumar(sumando1, sumando2);
                Output.mostrarResultado(resultado); break;
                
                case RESTA:
                Output.mostrarOperando("minuendo");
                int minuendo = Input.pedirNumero();
                Output.mostrarOperando("sustraendo");
                int sustraendo = Input.pedirNumero();
                resultado = Matematicas.restar(minuendo, sustraendo);
                Output.mostrarResultado(resultado); break;
                
                case MULTIPLICACION:
                Output.mostrarOperando("multiplicando");
                int multiplicando = Input.pedirNumero();
                Output.mostrarOperando("multiplicador");
                int multiplicador = Input.pedirNumero();
                resultado = Matematicas.multiplicar(multiplicando, multiplicador);
                Output.mostrarResultado(resultado); break;
                
                case DIVISION: 
                    Output.mostrarOperando("dividendo");
                    int dividendo = Input.pedirNumero();
                    int divisor;
                    do{
                        Output.mostrarOperando("divisor");
                        divisor = Input.pedirNumero();
                    }while (Validator.esIgual0(divisor));
                    resultado = Matematicas.dividir(dividendo, divisor);
                    Output.mostrarResultado(resultado); break;
            }      
        }while(Validator.userNoQuiereSalir(opcion));
    }
}