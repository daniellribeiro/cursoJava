//Compras no Supermercado
//
//- Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo 
//para as tarefas domésticas. Para economizar tempo ele faz a lista de compras do 
//supermercado em um aplicativo e costuma anotar cada item na mesma hora que percebe a falta dele 
//em casa.
//- O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais 
//de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas 
//desenvolvendo um código que exclua os itens duplicados da lista de compras e que
//os ordene alfabeticamente.


package aula4;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ComprasNoSupermercado {
	public static void main(String[] args) {
		
	Set lista = new TreeSet<>();
	ArrayList<String> listaArray = new ArrayList<String>();
	
	lista.add("leite");
	lista.add("batata");
	lista.add("cenoura");
	lista.add("arroz");
	lista.add("feijao");
	lista.add("arroz");
	lista.add("batata");
	lista.add("banana");
	lista.add("cenoura");
	lista.add("leite");
	
	listaArray.addAll(lista);
	//listaArray.sort(null);
	
	listaArray.forEach(l -> System.out.println(l));
  }
}
