package TP;

public class Order {
	//ordena os valores por MENOR PRAZO PRIMEIRO(incluindo com prazo 0)
	static Produto[] bubbleSort(Produto arr[], int n)
	{
		int i, j;
		Produto temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++)
		{
	     		swapped = false;
			 for (j = 0; j < n - i - 1; j++)
			{
				if (arr[j].prz > arr[j + 1].prz)
				{
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
		 return arr; //retorna os valores ordenados pro prazo(menor para maior)
	}

}
