package TP;
//FERNANDO V. VALENTIM PUC-MINAS
//Programa que simula o empacotamento dos produtos. O programa recebe o path(caminho) do arquivo txt. DEVE SER INSERIDO PELO USUÁRIO O CAMINHO QUE SE ENCONTRA O TXT
//O Programa le o arquivo, e baseado na padronização do mesmo; os ordena por menor-prazo-primeiro.

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FabricaSimulacao {
	public static void main(String args[]) throws FileNotFoundException {
		BracoMecanico Braco1 = new BracoMecanico(1);	
		BracoMecanico Braco2 = new BracoMecanico(2);		

		//le o arquivo txt 
		Produto pedidos[] = reader.readFile("C:\\Users\\Hippo\\git\\Trabalho-Escalonamento-de-processos\\TP!\\pedidos.txt"); // <--- insira o caminho do arquivo txt de pedidos

		//separa metade dos pedidos 
		Produto pedidosEven[] = sorter.sortEven(pedidos);
		Produto pedidosOdds[] = sorter.sortOdds(pedidos);

		//ordena os pedidos. >>>>>>  PRAZO MAIS CURTO PRIMEIR0 <<<<<<<	
		Produto OrdenedA[] = sorter.sort(pedidosEven);
		Produto OrdenedB[] = sorter.sort(pedidosOdds);


	   
		//exebicição dos pedidos JA ORDENADOS feitos pelos braços mecanicos
		//[00:00:00] = TEMPO GLOBAL. Simula o temp GERAL da fábrica(atualizado a cada CAIXA). cada braço mostra em qual ponto se encontra no tempo ao terminar cada caixa
			
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a simulação:");
		System.out.println("digite 1 para a simulação com threads [!aviso! ainda em implementação] A exibição no terminal é bugada pois são executadas E exebidas ao mesmo tempo");
		System.out.println("digite 0 para a simulação SEM threads. O programa primeiro executa e exibe a simulação do braço 1, depois do braço 2");
		int opc = teclado.nextInt();
		
		if(opc == 1) {
			System.out.println("PEDIDOS: " + "\r\n");
			// MULTITHREADING
			//AINDA EM FASE DE IMPLEMENTAÇÃO - PROVANDO QUE AMBOS MÉTODOS ESTÃO FUNCIONANDO NO SISTEMA DE MULTITHREADING EM CONCORRÊNCIA; QUANDO EXECUTADO, A EXIBIÇÃO NO TERMINAL
			//FICA BUGADA POIS AS THREADS SE SOBRESSAEM UMAS NAS OUTRAS SE "ATROPELANDO" 
			//QUANDO EXECUTADO OS DOIS MÉTODOS NORMAIS, É VISIVEL QUE O JAVA EXECUTA PRIMEIRO 100% DA PRIMEIRA, DEPOIS 100% DA SEGUNDA
			
			new Thread() { 
		        public void run() {
		        	Braco1.work(OrdenedA);
		        }
		    }.start();
		    new Thread() { 
		        public void run() {
		        	Braco2.work(OrdenedB);
		        }
		    }.start();  

		} else if (opc == 0 ) {
			System.out.println("PEDIDOS: " + "\r\n");
			//METODOS NORMAIS. PRIMEIRO O METODO 1 É EXECUTADO; ENTÃO FINALIZADO, DEPOIS O METODO 2 É EXECUTADO E FINALMENTE EXECUTADO
			Braco1.work(OrdenedA);
			Braco2.work(OrdenedB);
		}

	}

}
