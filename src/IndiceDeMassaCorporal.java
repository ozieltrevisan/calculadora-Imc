public class IndiceDeMassaCorporal {

    double peso;
    double altura;
    double resultado;

    boolean estaComObisidade(){
        return resultado >= 30;
    }
    boolean estaAbaixoDopesoIdeal(){
        return resultado <= 18.5;
    }
}
