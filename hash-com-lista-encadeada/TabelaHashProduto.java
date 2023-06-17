public class TabelaHashProduto {

	private int M;	/// tamanho da tabela hash.
    				/// M deve ser um número primo grande para diminuirmos a probabilidade de colisões.

	private ListaProduto[] tabelaProdutos; 	/// tabela que referenciará todas as listas lineares encadeadas de produtos.
    										/// Nesse caso, estamos utilizando uma tabela hash com endereçamento em separado,
    										/// ou seja, os produtos são armazenados em listas lineares encadeadas.

	/// Construtor da classe.
	/// Esse método é responsável por inicializar a tabela hash de produtos que trabalha com endereçamento em separado.
	/// Assim, esse método atribui, ao atributo M, dessa classe, o valor passado através do parâmetro tamanho.
	/// Esse método também cria um vetor, de tamanho M, de listas lineares de produtos; e o atribui ao atributo tabelaProdutos.
	/// Adicionalmente, cada célula do vetor é inicializada com uma lista encadeada de produtos vazia.
	/// Parâmetro "tamanho": tamanho da tabela hash. 
	public TabelaHashProduto(int tamanho){
		/// atribui, ao atributo M, dessa classe, o valor passado através do parâmetro tamanho.
		M = tamanho;

		/// cria um vetor, de tamanho M, de listas lineares de produtos; e o atribui ao atributo tabelaProdutos.
		tabelaProdutos = new ListaProduto[M];

		/// cada célula do vetor é inicializada com uma lista encadeada de produtos vazia.
		for (int i = 0; i < M; i++)
			tabelaProdutos[i] = new ListaProduto();
	}

	/// Esse método implementa a função de transformação da tabela hash, 
	/// ou seja, calcula a posição, na tabela hash, em que o produto,
	/// que possui o código de barras informado através do parâmetro chave, deve ser encontrado.
	/// A função de transformação utilizada corresponde ao resto da divisão da chave pelo tamanho da tabela hash.
	/// Parâmetro "chave": chave da qual desejamos saber a posição na tabela hash.
	/// Retorna a posição que o item, cuja chave corresponde a que foi passada como parâmetro para esse método, 
	/// deve ocupar na tabela hash.
	private int funcaoHash(int chave){ 
		return (chave % M);
	}

	/// Método responsável por inserir um novo produto na tabela hash.
	/// Não é permitido inserir, nessa tabela hash, mais de um produto com um mesmo código de barras.
	/// Parâmetro "produtoNovo": referência ao produto que deve ser inserido na tabela hash.
	/// Retorna a posição na tabela hash em que o novo produto foi inserido; ou -1, caso já exista produto
	/// armazenado na tabela hash com o mesmo código de barras do produto informado.
	public int inserir(Produto produtoNovo){

		/// cálculo da posição da tabela hash em que o novo produto deverá ser armazenado.
		int posicao = funcaoHash(produtoNovo.getCodigoBarras());

		/// pesquise o produto, passado como parâmetro para esse método, na lista encadeada de produtos 
		/// associada à posição, da tabela hash, em que esse novo produto deverá ser adicionado.
		/// Se o produto não for localizado, 
		/// ele é inserido no final da lista encadeada de produtos
		/// associada à posição, da tabela hash, em que esse novo produto será localizado. 
		if ((tabelaProdutos[posicao].localizar(produtoNovo.getCodigoBarras())) == null){
			tabelaProdutos[posicao].inserirFinal(produtoNovo);
			return posicao;
		}
		else{
			System.out.println("O produto de código de barras " + produtoNovo.getCodigoBarras() + " já está inserido na tabela de produtos.");
			return -1;
		}
	}

	/// Método responsável por localizar, na tabela hash, o produto,
	/// cujo código de barras corresponde ao que foi passado como parâmetro para esse método.
	/// Parâmetro "codigoBarras": código de barras do produto que deve ser localizado na tabela hash.
	/// Retorna uma referência ao produto encontrado; ou null, caso o produto não tenha sido localizado na tabela hash.
	public Produto pesquisar(int codigoBarras){
		
		/// cálculo da posição da tabela hash em que o produto deverá ser localizado.
		int posicao = funcaoHash(codigoBarras);

		/// pesquise o produto, cujo código de barras foi passado como parâmetro para esse método,
		/// na lista encadeada de produtos associada à posição, da tabela hash, em que esse produto deve estar armazenado.
		return (tabelaProdutos[posicao].localizar(codigoBarras));
	}

	/// Método responsável por imprimir todo o conteúdo da tabela hash.
	/// É impresso o índice da tabela hash e seu correspondente conteúdo.
	/// Se a posição da tabela hash estiver vazia, é impressa uma mensagem explicativa.
	/// Caso contrário, para todos os produtos, armazenados na lista encadeada de produtos
	/// associada a uma posição da tabela hash, são impressos seus dados.
	public void imprimir(){
		
		for (int i = 0; i < M; i++){
			if (tabelaProdutos[i].listaVazia())
				System.out.println("A posição " + i + " da tabela hash está vazia.");
			else{
				System.out.println("Posição " + i + " da tabela hash: ");
				tabelaProdutos[i].imprimir();
			}
		}	
	}
}