package TP;

public class sorter {
	public static Produto[] sort(Produto[] pedidos) {

		int i =0;
		int a = pedidos.length;

		//obtem os valores sem prazo 
		int countZeros = 0;
		for( i = 0 ; i < a ; i ++) {
			if(pedidos[i].prz == 0) {
				countZeros++;
			}
		}

		 Produto[] inp = Order.bubbleSort(pedidos, a); //ordena eles por MENOR PRAZO PRIMEIRO

		if(countZeros == 0) {

			return inp; //caso n tenha nenhum pedido com prazo 0

		} else {
			//caso um pedidos com prazo 0; é são criados 2 arrays
			Produto[] with0 = new Produto[countZeros];  //contendo os valores com 0
			Produto[] no0 = new Produto[a - countZeros];  //contendo os valores sem 0
			if (countZeros > 0 && countZeros < a) {

				for ( i = 0; i < countZeros; i++) {
					with0[i] = inp[i];
				}

				for ( i = 0; i < a - countZeros; i++) {
					no0[i] = inp[i + countZeros];
				}

			}    

			//os como prazo normal e ja ordenado MENOR PRAZO PRIMEIRO são colocados no começo da lista
			for( i  = 0; i < no0.length; i ++) {
				inp[i] = no0[i];
			}

			//os com prazo 0 são colocados no final da lista
			for(i = 0; i < countZeros; i++) {
				inp[i + (a - countZeros)] = with0[i];
			}

			return inp;


		}

	}
 
	public static Produto[] sortEven(Produto[] pedidos) {
		int odds = 0;
		
		for(int i = 0 ; i < pedidos.length ; i++) {
			if(i%2 == 0) {
				odds ++;
			}
		}
		
		Produto pedidosEven[] =  new Produto[odds];
		
		int cart = 0;
		for(int j = 0 ; j < pedidos.length ; j++) {
			if(j%2 == 0) {
				pedidosEven[cart] = pedidos[j];
				cart++;
			}
		}
		
		
		
		
		return pedidosEven;
		
	}

	public static Produto[] sortOdds(Produto[] pedidos) {
		int odds = 0;
		
		for(int i = 0 ; i < pedidos.length ; i++) {
			if(!(i%2 == 0)) {
				odds ++;
			}
		}
		 
		Produto pedidosOdds[] =  new Produto[odds];
		
		int cart = 0;
		for(int j = 0 ; j < pedidos.length ; j++) {
			if(!(j%2 == 0)) {
				pedidosOdds[cart] = pedidos[j];
				cart++;
			}
		}
		
		
		
		
		return pedidosOdds;
		
	}

}
