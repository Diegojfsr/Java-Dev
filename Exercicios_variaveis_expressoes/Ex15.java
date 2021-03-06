/* Leia um angulo em radianos e apresente-o convertido em graus. 
A formula de conversao e: G = R ∗ 180/π, sendo G o angulo em graus e R em radianos e π = 3.14. */


import java.util.Scanner; //importa a classe de entrada de dados
import java.text.DecimalFormat; //importa a classe de formatação de saida de dados
import java.text.NumberFormat; //importa a classe de formatação de saida de dados


public class Ex15 {

	public static void main(String[] args) {
		//Instanciando o objeto teclado, dentro da classe Scanner para entrada
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de um angulo(RADIANOS)");

		//"try" Execulta o bloco de codigo e se acontecer uma falha "catch" pega a mensagem de falha
		//Bloco monitorado/erro
		try {
			//double e o tipo de variavel
			double radianos = teclado.nextDouble();
			double graus = radianos * (180 / Math.PI);

			//Objeto de formatação; formata a quantidade de casa decimais
			NumberFormat namberformat = new DecimalFormat("#,##0");

			//Mensagem de saida
            System.out.println( " O Angulo(RADIANOS) informado foi convertido para " + namberformat.format(graus) + " Graus ");
			
		} 
		
		// Mensagem de falha
		// Tipo da exception/tratamento do erro
		catch (Exception e) {
			System.out.println("Falha :" + e.getMessage() );
		}
		
	}
	
}