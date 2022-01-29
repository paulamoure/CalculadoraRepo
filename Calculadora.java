import Entrada.Input;
import Validation.Validator;
import Calculo.Matematicas;
import Salida.*;

public class Calculadora{
    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    private static final int AREA_TRIANGULO = 5;
    private static final int AREA_CUADRADO = 6;
    //Declarar constantes
    public static void main (String[] args) {
        int opcion;
        Logger logger = new Logger();
        System.out.println("Bienvenido a esta calculadora!");
        do  {
            do {
                Output.mostrarOpciones();
                opcion = Input.pedirNumero();
            }while(Validator.noEsOpcionValida(opcion));
            switch(opcion){
                case SUMA:
                    logger.log ("suma");
                    Output.mostrarOperando("sumando");
                    int sumando1 = Input.pedirNumero();
                    int sumando2 = Input.pedirNumero();
                    int resultado = Matematicas.sumar(sumando1, sumando2);
                    Output.mostrarResultado(resultado);
                    break;
                
                case RESTA:
                    logger.log ("resta");
                    Output.mostrarOperando("minuendo");
                    int minuendo = Input.pedirNumero();
                    Output.mostrarOperando("sustraendo");
                    int sustraendo = Input.pedirNumero();
                    resultado = Matematicas.restar(minuendo, sustraendo);
                    Output.mostrarResultado(resultado);
                    break;
                
                case MULTIPLICACION:
                    logger.log ("multiplicación");
                    Output.mostrarOperando("multiplicando");
                    int multiplicando = Input.pedirNumero();
                    Output.mostrarOperando("multiplicador");
                    int multiplicador = Input.pedirNumero();
                    resultado = Matematicas.multiplicar(multiplicando, multiplicador);
                    Output.mostrarResultado(resultado);
                    break;
                
                case DIVISION: 
                    logger.log ("división");
                    Output.mostrarOperando("dividendo");
                    int dividendo = Input.pedirNumero();
                    int divisor;
                    do{
                        Output.mostrarOperando("divisor");
                        divisor = Input.pedirNumero();
                    }while (Validator.esIgual0(divisor));
                    resultado = Matematicas.dividir(dividendo, divisor);
                    Output.mostrarResultado(resultado); break;
                    
                case AREA_TRIANGULO:
                    logger.log("area del triangulo");
                    Output.mostrarOperando("base");
                    int base = Input.pedirNumero();
                    Output.mostrarOperando("altura");
                    int altura = Input.pedirNumero();
                    resultado = Matematicas.calcularAreaTriangulo(base, altura);
                    Output.mostrarResultado(resultado); break;
                    
                case AREA_CUADRADO:
                    logger.log("area del cuadrado");
                    Output.mostrarOperando("lado");
                    int lado = Input.pedirNumero();
                    resultado = Matematicas.calcularAreaCuadrado(lado);
                    Output.mostrarResultado(resultado); break;
            }      
        }while(Validator.userNoQuiereSalir(opcion));
    }
}
