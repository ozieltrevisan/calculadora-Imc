import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();

        CalculadoraImc calculadoraImc = new CalculadoraImc();
        System.out.print("Digite sua Altura: ");
         paciente.altura = entrada.nextDouble();
        System.out.print("Digite seu Peso: ");
        paciente.peso = entrada.nextDouble();

        IndiceDeMassaCorporal imc = calculadoraImc.calcular(paciente);

        if (imc.estaComObisidade()){
            System.out.printf("Paciente com altura de %.2f e com peso de %.2f esta com Obisidade%n",
                    imc.altura, imc.peso);
        } else if (imc.estaAbaixoDopesoIdeal()) {
            System.out.printf("Paciente cm Altura %.2f e Peso %.2f esta Abaixo do peso Ideal%n",
                    imc.altura,imc.peso);

        }
        {

        }
        System.out.printf("IMC: %.2f", imc.resultado);


    }
}