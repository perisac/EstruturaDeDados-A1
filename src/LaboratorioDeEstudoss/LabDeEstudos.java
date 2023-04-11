package LaboratorioDeEstudoss;

import java.util.Arrays;
import java.util.Random;

import Ordenacao.*;

public class LabDeEstudos {

	public static void main(String[] args) {
		
		int[] vetor = { 4, 6, 2, 3, 1, 7, 8, 9, 5, 12 };
		int[] randomArray = new int[400];
		MergeSort merge = new MergeSort();

		Random random = new Random();
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = random.nextInt(400);
		}
		
		System.out.println("Array desordenado:");
		System.out.println(Arrays.toString(vetor));
		System.out.println("Array ordenado");
		merge.mergeSortOrder(vetor, 0, vetor.length-1);
		System.out.println(Arrays.toString(vetor));

		System.out.println("Exemplo maior:");
		System.out.println(Arrays.toString(randomArray));
		merge.mergeSortOrder(randomArray, 0, randomArray.length-1);
		System.out.println("Ordenado:");
		System.out.println(Arrays.toString(randomArray));
	}
}
