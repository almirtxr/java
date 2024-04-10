package filmes.api;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ordenacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random numRand = new Random();
        
        char op;
        System.out.println("Deseja fazer automatico ou manual? a/m \n");
        op = leitor.next().charAt(0);
        if (op == 'm') {
        	int n = leitor.nextInt();
            int vet[] = new int[n];
            int i = 0;
            for (i = 0; i < n; i++) {
                vet[i] = leitor.nextInt();

            }

            if (!estaOrdenado(vet)) {
                ordenaNum(vet);
            }
            
            if (estaOrdenado(vet)) {
                System.out.println("Sequência ordenada");
            } else {
                System.out.println("Sequência não ordenada. Deseja ordenar? s/n \n");
                ordenaNum(vet);
                System.out.println(Arrays.toString(vet));
            }
        }
        else {
        	int qtd = 0;
        	System.out.println("Quantos números deseja: \n");
        	qtd = leitor.nextInt();
        	int vet2[] = new int[qtd];
        	int nums = 0;
        	for (int h = 0; h < qtd; h++) {
        		nums = numRand.nextInt(qtd);
        		vet2[h] = nums;
        	}
        	ordenaNum(vet2);
        	System.out.println(Arrays.toString(vet2));
        }

    }
    public static void ordenaNum(int[] array) {
    	int x = array.length;
    	for (int i = 0; i < x-1; i++) {
    		for (int j = 0; j < x-i-1; j++) {
    			if (array[j] > array[j+1]) {
    				int temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    }
    public static boolean estaOrdenado(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

}

