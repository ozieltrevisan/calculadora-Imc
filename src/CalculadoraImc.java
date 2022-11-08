public class CalculadoraImc {

    IndiceDeMassaCorporal calcular (Paciente paciente){
        IndiceDeMassaCorporal imc = new IndiceDeMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;

    }


}
