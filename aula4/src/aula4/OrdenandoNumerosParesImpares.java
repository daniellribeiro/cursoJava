package aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Ordenando Números Pares e Ímpares
//
//- Complete o programa, ele está recebendo valores inteiros como entrada.
//- Ordene estes valores de acordo com o seguinte critério:
//- Primeiro os Pares
//- Depois os Ímpares
//- Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

public class OrdenandoNumerosParesImpares {

	public static void main(String[] args) {
	
	ArrayList<Integer> lista = new ArrayList<Integer>();
	ArrayList<Integer> listaPar = new ArrayList<Integer>();
	ArrayList<Integer> listaImpar = new ArrayList<Integer>();
    
	  for(int contador = 0; contador < 101; contador++){
	    lista.add(contador);
	    if(contador % 2 == 0)
	    	listaPar.add(contador);
	    else
	    	listaImpar.add(contador);
	  }
	  
	  listaPar.sort(null);
	  listaImpar.sort(Collections.reverseOrder());
	  
	  listaPar.forEach(numeroPar -> System.out.println(numeroPar));
	  listaImpar.forEach(numeroImpar -> System.out.println(numeroImpar));
	}
}
