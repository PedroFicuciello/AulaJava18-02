package aulaJava;

import java.util.Arrays;

public class AulaJava {

	public static void main(String[] args) {
		
		//3 - Declare uma variável do tipo String com a frase "Curso de Java"
		String a = "Curso de Java";
		
		//4 -  Concatene na váriavel criada acima a frase "- Exemplo String"
		a += (" - Exemplo String");
		
		//5 - Imprima na tela (console) o número de caracteres da String
		//(OLHA O SYSTEM.OUT)
		
		//6 - Crie uma nova String, pegando o pedaço da primeira String que compreenda a frase "Exemplo String"  
		String b = (a.substring(16,30));
		
		//Desafio - Faça o mesmo que o Exercício 6, porém sem usar posição (índice)fixa 
		String [] desafio = a.split("Curso de Java -");
		
		System.out.println (a);
		System.out.println (a.length());
		System.out.println (b);
		System.out.println (Arrays.toString(desafio));
	}

}
