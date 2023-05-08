package testeJunitGraus;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteConversao {
	Conversao conversao = new Conversao();

	@Test
    public void testConversaoFahrenheitParaCelsius() {
        // Valor esperado para a conversão de 32°F para Celsius
        double valorEsperado = 0.0;

        // Definir o valor em Fahrenheit para teste
        double tempFahrenheit = 32.0;

        // Executar o método de conversão do código fornecido
        double tempCelsius = conversao.conversion();

        // Verificar se o valor convertido é igual ao valor esperado
        assertEquals(valorEsperado, tempCelsius, 0.001);
    }

}
