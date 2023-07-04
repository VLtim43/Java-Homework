package TP;

public abstract class Produto { //pedido
	String name = null;  //nome do cliente 
	int qdt = 0;    //quantidade de produtos
	int prz = 0;    //prazo de entrega
	
	int dtChegada;  // horario de chegada do pedido
	int esteira;    //qual dos bracos mecanicos fez o pedido
	boolean prize;  //se o produto é marcado como priotirario*
	
	double caixas; //quantas caixas o pedido terá(baseado em quantos produtos do tipo em questão cabem na caixa)

	public Produto(String a, int b, int c, int d) {
		 this.name = a;
		this.qdt = b;
		this.prz = c;
		this.dtChegada = d;
	}

	public void show() {
		System.out.println("NOME CLIENTE: " + this.name);
		System.out.println("QUANTIDADE DE PROTUDOS: " + this.qdt);
		System.out.println("QUANTIDADE DE CAIXAS: " + this.caixas);
		System.out.println("PRAZO DE ENTREGA: {" + this.prz + "} MINUTOS");
		System.out.println("HORARIO DE CHEGADA DO PEDIDOS: " + this.dtChegada );

	}
 
	public void whoMade(int x) {   //seta qual braco mecanico ficou responsavel pelo pedido
		this.esteira = x;
		System.out.println("BRAÇO MECANICO RESPONSAVEL [" + esteira + "]"  + "\r\n" );
	}
	
	public void execPedido() {
		float pedidoTime = (float) (this.caixas * 5.5);
		System.out.println("TEMPO DE EXECUÇÃO TOTAL DO PEDIDO: " +  convertTime.secTomin(Math.round(pedidoTime)) );
	}
	
	
}
