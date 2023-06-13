public class Inteiro {
	private int valor;

	public Inteiro() {
		this.valor = 0;
	}
	
	public Inteiro(int i) {
		this.valor = i;
	} 
	
	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void imprimir() {
		System.out.println("Valor: " + this.valor);
	}
}
