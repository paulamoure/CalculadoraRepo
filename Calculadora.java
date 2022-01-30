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
    private static final int SALIR = 7;
    //Declarar constantes
    public static void main (String[] args) {
        int opcion;
        Logger logger = new Logger();
        System.out.println("¡Os damos la bienvenida a esta calculadora!");
        do  {
            do {
                Output.mostrarOpciones();
                opcion = Input.pedirOpcion();
            }while(Validator.valorNoEstaEnRango(SUMA, opcion, SALIR));
            switch(opcion){
                case SUMA:
                    logger.log ("suma");
                    Output.mostrarPedirOperando("sumando 1:");
                    int sumando1 = Input.pedirOperando();
                    Output.mostrarPedirOperando("sumando 2:");
                    int sumando2 = Input.pedirOperando();
                    int resultado = Matematicas.sumar(sumando1, sumando2);
                    Output.mostrarResultado(resultado);
                    break;
                
                case RESTA:
                    logger.log ("resta");
                    Output.mostrarPedirOperando("minuendo:");
                    int minuendo = Input.pedirOperando();
                    Output.mostrarPedirOperando("sustraendo:");
                    int sustraendo = Input.pedirOperando();
                    resultado = Matematicas.restar(minuendo, sustraendo);
                    Output.mostrarResultado(resultado);
                    break;
                
                case MULTIPLICACION:
                    logger.log ("multiplicación");
                    Output.mostrarPedirOperando("multiplicando");
                    int multiplicando = Input.pedirOperando();
                    Output.mostrarPedirOperando("multiplicador");
                    int multiplicador = Input.pedirOperando();
                    resultado = Matematicas.multiplicar(multiplicando, multiplicador);
                    Output.mostrarResultado(resultado);
                    break;
                
                case DIVISION: 
                    logger.log ("división");
                    Output.mostrarPedirOperando("dividendo");
                    int dividendo = Input.pedirOperando();
                    int divisor;
                    do{
                        Output.mostrarPedirOperando("divisor");
                        divisor = Input.pedirOperando();
                    }while (Validator.esIgualA0(divisor));
                    resultado = Matematicas.dividir(dividendo, divisor);
                    Output.mostrarResultado(resultado); break;
                    
                case AREA_TRIANGULO:
                    logger.log("hallar el área del triangulo");
                    Output.mostrarPedirOperando("base:");
                    int base = Input.pedirOperando();
                    Output.mostrarPedirOperando("altura:");
                    int altura = Input.pedirOperando();
                    resultado = Matematicas.calcularAreaTriangulo(base, altura);
                    Output.mostrarResultado(resultado); break;
                    
                case AREA_CUADRADO:
                    logger.log("hallar el área del cuadrado");
                    Output.mostrarPedirOperando("lado:");
                    int lado = Input.pedirOperando();
                    resultado = Matematicas.calcularAreaCuadrado(lado);
                    Output.mostrarResultado(resultado); break;
            }      
        }while(Validator.usuarioNoQuiereSalir(opcion, SALIR));
    }
}
