package cursoJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class TesteCliente {
	
	public static void main(String[] args) {
		Cliente c = new Cliente("Daniel","12345678900",1234,12345678);
		//System.out.println(c.getNome());
		//System.out.println(c.getCpf());
		
		//System.out.println(c.consultarCliente());
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		ArrayList<String> nomeClientes = new ArrayList<String>();
		

		Cliente c1 = new Cliente("Luis","30708162070",1234,12745073);

		Cliente c2 = new Cliente("Jose","29786375017",1234,609601234);

		
		lista.add(c);
		lista.add(c1);
		lista.add(c2);
		
//		//Antes do Java 5
//		Iterator<Cliente> i = lista.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next().getNome());
//		}
//		
//	  //Entre Java 5 e Java 8
//		for(Cliente conta : lista) {
//			System.out.println(conta.getNome());
//		}
		
     //Depois do Java 8
	 //lista.forEach(cliente -> System.out.println(cliente.getNome()));
	
	 //Sort
	 lista.sort(Comparator.comparing(cliente -> cliente.getNome()));
	 
	 lista.sort(Comparator.comparing(Cliente::getNome));
	 
	 lista.stream().filter(cliente -> !(cliente.getNome().contains("Jose"))).forEach(cliente -> System.out.println(cliente.getNome()));
	 

	 lista.forEach(cliente -> System.out.println(cliente.getNome()));
	 
	 System.out.println(lista.stream().findAny().get().getNome());
	 
	}
}