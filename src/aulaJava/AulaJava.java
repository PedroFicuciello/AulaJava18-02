package aulaJava;

import java.util.Arrays;

public class AulaJava {

	public static void main(String[] args) {
		
		//3 - Declare uma vari�vel do tipo String com a frase "Curso de Java"
		String a = "Curso de Java";
		
		//4 -  Concatene na v�riavel criada acima a frase "- Exemplo String"
		a += (" - Exemplo String");
		
		//5 - Imprima na tela (console) o n�mero de caracteres da String
		//(OLHA O SYSTEM.OUT)
		
		//6 - Crie uma nova String, pegando o peda�o da primeira String que compreenda a frase "Exemplo String"  
		String b = (a.substring(16,30));
		
		//Desafio - Fa�a o mesmo que o Exerc�cio 6, por�m sem usar posi��o (�ndice)fixa 
		String [] desafio = a.split("Curso de Java -");
		
		System.out.println (a);
		System.out.println (a.length());
		System.out.println (b);
		System.out.println (Arrays.toString(desafio));
	}

}
