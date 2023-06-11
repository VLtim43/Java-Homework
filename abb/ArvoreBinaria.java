public class ArvoreBinaria {
	public Nodo raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public ArvoreBinaria(Nodo no) {
		this.raiz = no;
	}
	
	public boolean vazia() {
		return (this.raiz == null);
	}
		
	public void adicionar(int valor) {
		if(this.raiz == null)
			this.raiz = new Nodo(valor);
		else
			this.inserir(this.raiz, valor);
	}
	
	private Nodo inserir(Nodo raizSubarvore, int valor) {
		if(raizSubarvore == null) {
			raizSubarvore = new Nodo(valor);
		}
		else {
			if(valor > raizSubarvore.valor) {
				raizSubarvore.direita = this.inserir(raizSubarvore.direita, valor);
			}
			else if(valor < raizSubarvore.valor) {
				raizSubarvore.esquerda = this.inserir(raizSubarvore.esquerda, valor);
			}
			else {
				System.out.println("Valor já inserido na árvore.");
			}
		}
		return raizSubarvore;
	}
	
	public Nodo encontraSubstituto(Nodo raizSubarvore, Nodo pai) {
		if(raizSubarvore.direita != null)
			return this.encontraSubstituto(raizSubarvore.direita, raizSubarvore);
		else
			return pai;
	}
	
	private Nodo remover(Nodo raizSubarvore, int valor) {
		//se a subárvore for diferente de null, percorre 
		// (caso contrário, chave não encontrada)
		if(raizSubarvore != null) { 
			//se a chave for maior que o valor, vai para direita
			if(valor > raizSubarvore.valor) { 
				raizSubarvore.direita =  this.remover(raizSubarvore.direita, valor);
			}
			//se a chave for menor que o valor, vai para esquerda
			else if(valor < raizSubarvore.valor){
 				raizSubarvore.esquerda = this.remover(raizSubarvore.esquerda, valor);
			}
			else{ // if(raizSubarvore.valor == valor) {}
				//remoção de grau 0
				if(raizSubarvore.direita == null && raizSubarvore.esquerda == null) {
					raizSubarvore = null;
				}
				//remoção de grau 1 (à esquerda)
				else if(raizSubarvore.direita == null) {
					raizSubarvore = raizSubarvore.esquerda;
				}
				//remoção de grau 1 (à direita)
				else if(raizSubarvore.esquerda == null) {
					raizSubarvore = raizSubarvore.direita;
				}
				else {
					//remoção de grau 2
					Nodo maisDirSubarvoreEsq = this.encontraSubstituto(raizSubarvore.esquerda, raizSubarvore);
					if(maisDirSubarvoreEsq == this.raiz) {
						maisDirSubarvoreEsq.esquerda.direita = raizSubarvore.direita;
						raizSubarvore = maisDirSubarvoreEsq.esquerda;
					}
					else {
						raizSubarvore.valor = maisDirSubarvoreEsq.direita.valor;
						maisDirSubarvoreEsq.direita = maisDirSubarvoreEsq.direita.esquerda;
					}
				}
			}
			/*else {
				System.out.println("Chave não encontrada");
			}*/
		}
		
		return raizSubarvore;
	}
	
	public void remover(int valor) {
		this.raiz = this.remover(this.raiz, valor);
	}
	
	public void imprimirPreOrdem(Nodo raizSubarvore) {
		if(raizSubarvore != null) {
			System.out.print(raizSubarvore.valor + ", ");
			imprimirPreOrdem(raizSubarvore.esquerda);
			imprimirPreOrdem(raizSubarvore.direita);
		}
	}
	
	public void imprimirEmOrdem(Nodo raizSubarvore) {
		if(raizSubarvore != null) {
			imprimirEmOrdem(raizSubarvore.esquerda);
			System.out.print(raizSubarvore.valor + ", ");
			imprimirEmOrdem(raizSubarvore.direita);
		}
	}
	
	public void imprimirPosOrdem(Nodo raizSubarvore) {
		if(raizSubarvore != null) {
			imprimirPosOrdem(raizSubarvore.esquerda);
			imprimirPosOrdem(raizSubarvore.direita);
			System.out.print(raizSubarvore.valor + ", ");
		}
	}
}
