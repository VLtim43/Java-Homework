public class No {
	private Inteiro item;
	private int altura;
	private No esquerda;
	private No direita;
	
	public No() {
		this.item = new Inteiro();
		this.altura = 0;
		this.esquerda = null;
		this.direita = null;
	}
	
	public No(Inteiro registro) {
		this.item = registro;
		this.altura = 0;
		this.esquerda = null;
		this.direita = null;
	}
	
	public Inteiro getItem() {
		return this.item;
	}
	
	public void setItem(Inteiro item) {
		this.item = item;
	}
	
	public No getEsquerda() {
		return this.esquerda;
	}
	
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public No getDireita() {
		return this.direita;
	}
	
	public void setDireita(No direita) {
		this.direita = direita;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura() {
		int alturaEsq, alturaDir;
		
		if (this.direita == null)
			alturaDir = -1;
		else
			alturaDir = this.direita.getAltura();
		
		if (this.esquerda == null)
			alturaEsq = -1;
		else
			alturaEsq = this.esquerda.getAltura();
		
		if (alturaEsq > alturaDir)
			this.altura = alturaEsq + 1;
		else
			this.altura = alturaDir + 1;
	}
	
	public int getFatorBalanceamento() {
		int alturaEsq, alturaDir;
		
		if (this.direita == null)
			alturaDir = -1;
		else
			alturaDir = this.direita.getAltura();
		
		if (this.esquerda == null)
			alturaEsq = -1;
		else
			alturaEsq = this.esquerda.getAltura();
		
		return (alturaEsq - alturaDir);
	}
}