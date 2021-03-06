/* Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao
e: R = G ∗ π/180, sendo G o angulo em graus e R em radianos e π = 3.14.*/

import java.util.Scanner; //importa a classe de entrada de dados
import java.text.DecimalFormat; //importa a classe de formatação de saida de dados
import java.text.NumberFormat; //importa a classe de formatação de saida de dados


public class Exercicio14 {
    

            public static void main(String[] args) {
                //Instanciando o objeto teclado, dentro da classe Scanner para entrada
                Scanner teclado = new Scanner(System.in);
                    
                System.out.println("Informe o valor de um angulo(GRAUS)");   
                
                //double e o tipo de variavel
			    double graus = teclado.nextDouble();
			    double radianos = graus * (180 / Math.PI);


                //Objeto de formatação; formata a quantidade de casa decimais
			    NumberFormat namberformat = new DecimalFormat("#,##0");

  
                //Mensagem de saida
                System.out.println(" O Angulo(GRAUS) informado foi convertido para " + namberformat.format(radianos) + " Radianos " );   

            }
        

    


}