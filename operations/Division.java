package operations;

public class Division{
    int dividendo;
    int divisor;
    //inicializar lo que va a usar
    public Division(){
        //el constructor siempre tiene el mismo nombre que la clase
        //asignamos un valor inicial
        dividendo = 0;
        divisor = 0;
    }
    public Division(int divisor, int dividendo){
        //lo mismo pero pasas parametros al constructor
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    public int operar(){
        //hay poner int ya que va a devolver un int
        return dividendo/divisor;
    }
}
