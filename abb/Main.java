
public class Main {

	public static void main(String[] args) {
		ArvoreBinaria abb = new ArvoreBinaria();
		abb.adicionar(10);
		abb.adicionar(6);
		abb.adicionar(8);
		abb.adicionar(7);
		abb.adicionar(2);
		abb.adicionar(3);
		abb.adicionar(12);
		abb.adicionar(11);
		abb.adicionar(15);
		
		System.out.print("Pré-ordem: ");
		abb.imprimirPreOrdem(abb.raiz);
		System.out.println("");
		
		System.out.print("Em ordem:  ");
		abb.imprimirEmOrdem(abb.raiz);
		System.out.println("");
		
		System.out.print("Pós ordem: ");
		abb.imprimirPosOrdem(abb.raiz);
		System.out.println("");
		
		abb.remover(6);
		abb.remover(8);
		abb.remover(10);
		System.out.print("Em ordem:  ");
		abb.imprimirEmOrdem(abb.raiz);
	}
}
