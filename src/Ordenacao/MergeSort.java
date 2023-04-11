package Ordenacao;

public class MergeSort {

	public void mergeSortOrder(int [] vetor, int initialPos, int finalPos) {
				
		if (initialPos<finalPos) {
			
			int middle = (initialPos+finalPos)/2;
			mergeSortOrder(vetor,initialPos,middle);
			mergeSortOrder(vetor, middle+1, finalPos);
			intercalate(vetor, initialPos, middle, finalPos);
		}
	}
	
	public void intercalate(int [] vetor, int initialPos, int middlePos, int finalPos) {
		
		int [] aux = new int [vetor.length];
		
		for (int i = initialPos; i <= finalPos; i++) {
			aux [i] = vetor[i];
		}
		
		int left = initialPos;
		int right = middlePos+1;
		
		for (int i = initialPos; i <= finalPos; i++) {
			
			if (left > middlePos) {
				vetor[i] = aux[right++];
			}
			
			else if (right > finalPos) {
				vetor[i] = aux[left++];
			}
			
			else if (aux[left] < aux[right]) {
				
				vetor[i] = aux[left++];
			}
			else {
				vetor[i] = aux[right++];
			}
		}
		
	}
}