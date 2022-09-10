package cursoJava;

import java.util.ArrayList;
import java.util.Iterator;

public class testeConta {
	
	public static void main(String[] args) {
		Conta c = new Conta("Daniel","12345678900",1234,12345678);
		System.out.println(c.getNome());
		System.out.println(c.getCpf());
		
		System.out.println(c.consultarCliente());
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		

		Conta c1 = new Conta("Jose","29786375017",1234,609601234);

		Conta c2 = new Conta("Luis","30708162070",1234,12745073);
		
		lista.add(c);
		lista.add(c1);
		lista.add(c2);
		
		//Antes do Java 5
		Iterator<Conta> i = lista.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next().getNome());
		}
		
	  //Entre Java 5 e Java 8
		for(Conta conta : lista) {
			System.out.println(conta.getNome());
		}
		
     //Depois do Java 8
	 lista.forEach(conta -> System.out.println(conta.getNome()));
		
	}
}
