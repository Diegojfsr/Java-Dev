/* Leia uma distancia em quilometros e apresente-a convertida em milhas. A formula de
conversao e: M = K 1,61 , sendo K a distancia em quilometros e M em milhas.*/


import java.util.Scanner; //importa a classe de entrada de dados
import java.text.DecimalFormat; //importa a classe de formatação de saida de dados
import java.text.NumberFormat; //importa a classe de formatação de saida de dados


public class Exercicio13 {
    

            public static void main(String[] args) {
                //Instanciando o objeto teclado, dentro da classe Scanner para entrada
                Scanner teclado = new Scanner(System.in);
                    
                System.out.println("Informe a velocidade em km/h");                

                //double e o tipo de variavel
			    double velocKmH = teclado.nextDouble();
			    double velocMiH = velocKmH / 1.610;


                //Objeto de formatação; formata a quantidade de casa decimais
			    NumberFormat namberfoFormat = new DecimalFormat("#,##0");

  
                //Mensagem de saida
                System.out.println("A velocidade em Milhas e de: " + namberfoFormat.format(velocMiH) +  " Milhas/h" );   

            }
        

    


}