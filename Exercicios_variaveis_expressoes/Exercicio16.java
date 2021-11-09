/* Leia um valor de comprimento em polegadas e apresente-o convertido em centimetros.
A formula de conversao e: C = P ∗ 2, 54, sendo C o comprimento em centımetros e P o
comprimento em polegadas. */


import java.util.Scanner; //importa a classe de entrada de dados
import java.text.DecimalFormat; //importa a classe de formatação de saida de dados
import java.text.NumberFormat; //importa a classe de formatação de saida de dados


public class Exercicio16 {
    

            public static void main(String[] args) {
                //Instanciando o objeto teclado, dentro da classe Scanner para entrada
                Scanner teclado = new Scanner(System.in);
                    
                System.out.println("Informe um comprimento(POLEGADAS)");   
                
                //double e o tipo de variavel
			    double polegadas = teclado.nextDouble();
			    double centimetros = polegadas*2.54;


                //Objeto de formatação; formata a quantidade de casa decimais
			    NumberFormat namberformat = new DecimalFormat("#,##0");

  
                //Mensagem de saida
                System.out.println( " O comprimento informado foi convertido para " + namberformat.format(centimetros) + " Centimetros ");
                

            }


}