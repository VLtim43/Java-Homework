package TP;

public class ProdutoA extends Produto {
     int size = 250;
     int type = 1;
	 
	public ProdutoA(String a, int b, int c, int d) {
		super(a, b, c, d);
		 
		if( b <= 20) {
			caixas = 1;
		} else if ( b > 20) {
		    	caixas = Math.ceil((double)b/(double)20);
		}
		
		
	}

}
