//Notas da Prova
//Norminia é uma professora e está costumada a dar notas de 0 (zero) 
//a 100(cem), no entanto, os estudante acharam estranho, uma vez que
//as notas devem ser dadas como conceitos de A a E. O conceito A é o mais alto, enquanto 
//o conceito E é o mais baixo.
//Conversando com outros docentes, ela recebeu a sugestão de utilizar a seguinte tabela, 
//relacionando as notas numéricas com as notas de conceitos:
//Notas da Prova
//  Nota     |       Conceito
//  0                    E
//  1   a 35          D
//  36 a 60          C
//  61 a 85          B
//  86 a 100        A


package aula4;

import java.util.Scanner;

public class NotasDaProva {
	public static void main(String[] args) {
		System.out.print("Digite a nota numerica: ");
		Scanner notaNumericaDigitada = new Scanner(System.in);
		
		int notaNumerica = Integer.parseInt(notaNumericaDigitada.nextLine());
		
		System.out.print("Conceito: ");
		if(notaNumerica == 0)
		    System.out.println("E");
		else if(notaNumerica > 0 && notaNumerica <= 35)
			System.out.println("D");
		else if(notaNumerica >= 36 && notaNumerica <= 60)
			System.out.println("C");
		else if(notaNumerica >= 61 && notaNumerica <= 85 )
			System.out.println("B");
		else if(notaNumerica >= 86 && notaNumerica <= 100)
			System.out.println("A");
		else
			System.out.println("Nota Fora do Padrao de 0 a 100");
		
		notaNumericaDigitada.close();
	}
}
