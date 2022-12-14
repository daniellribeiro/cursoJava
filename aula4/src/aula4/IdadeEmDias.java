//Idade em Dias 
//Voc? ter? o desafio de ler um valor inteiro correspondente ? idade de uma 
//pessoa em dias e informe-a em anos, meses e dias
//Obs.: apenas para facilitar o c?lculo, considere todo ano com 365 dias e todo m?s com 30
//dias. Nos casos de teste nunca haver? uma situa??o que permite 12 meses e alguns dias, 
//como 360, 363 ou 364.

package aula4;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

    	int idadeEmDias = 0;
    	int idadeEmAnos = 0;
    	int idadeEmMeses = 0;
    	
    	System.out.print("Digite uma idade em dias: ");
    	
    	Scanner idadeEmDiasDigitada = new Scanner(System.in);
        idadeEmDias = Integer.parseInt(idadeEmDiasDigitada.nextLine());
        
        System.out.println("Idade em dias digitada: " + idadeEmDias);
        
        while(idadeEmDias >= 365){
        	idadeEmDias-=365;
        	idadeEmAnos++;
        }
        
        while(idadeEmDias >= 30){
        	idadeEmDias-=30;
        	idadeEmMeses++;
        }
        
        System.out.println("A idade e Anos: " + idadeEmAnos 
        		           + ", Meses: " + idadeEmMeses 
        		           + ", Dias: " + idadeEmDias);
        
        idadeEmDiasDigitada.close();
    }
}