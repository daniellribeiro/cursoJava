//Combinação de Strings
//- Use os dois inputs de strings informados e combine-as alternando as letras de
//cada string.
//- Deve começar pela primeira letra da primeira string, seguido pela primeira letra da 
//segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma 
//sucessivamente.
//- As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string 
//resultante e retornada.


package aula4;

import java.util.ArrayList;

public class CombinacaoStrings {
	public static void main(String[] args) {
	  ArrayList<String> inputA = new ArrayList<String>();
	  ArrayList<String> inputB = new ArrayList<String>();

	  inputA.add("t");
	  inputB.add("e");
	  inputA.add("s");
	  inputB.add("t");
	  inputA.add("e");
	  inputB.add(" ");
	  inputA.add("c");
	  inputB.add("u");
	  inputA.add("r");
	  inputB.add("s");
	  inputA.add("o");
	  inputB.add(".");
	  
	  for(int i = 0 ; i < inputA.size() ; i++){
		  System.out.print(inputA.get(i) + inputB.get(i));
	  }
	}
}
