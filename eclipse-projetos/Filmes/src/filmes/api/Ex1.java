package exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    	
        Scanner leitor = new Scanner(System.in);
        Random numRand = new Random();
        
        char op;
        System.out.println("Deseja fazer automatico ou manual? a/m");
        op = leitor.next().charAt(0);
        char opOrd;
        if (op == 'm') {
        	System.out.println("Insira a quantidade de numeros: ");
        	int n = leitor.nextInt();
            int vet[] = new int[n];
            int i = 0;
            for (i = 0; i < n; i++) {
            	System.out.println("Insira o elemento nº " + i + "no vetor.");
                vet[i] = leitor.nextInt();

            }
            
            if (estaOrdenado(vet)) {
                System.out.println("Sequência ordenada");
            } else {
                System.out.println("Sequência não ordenada. Deseja ordenar? s/n \n");
                opOrd = leitor.next().charAt(0);
                if (opOrd == 's') {
                	long inicio = System.currentTimeMillis();

                	ordenaNum(vet);
                    System.out.println(Arrays.toString(vet));

                	long fim = System.currentTimeMillis();

                	long tempoDeExecucao = fim - inicio;
                	System.out.println("Tempo de execução: " + tempoDeExecucao + " milissegundos");

                }
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
        	
        	System.out.println(Arrays.toString(vet2));
        	
        	if (!estaOrdenado(vet2)) {
        		System.out.println("Vetor desordenado deseja ordenar? s/n");
        		opOrd = leitor.next().charAt(0);
        		if (opOrd == 's') {
                	long inicio = System.currentTimeMillis();

                	ordenaNum(vet2);
                    System.out.println(Arrays.toString(vet2));

                	long fim = System.currentTimeMillis();

                	long tempoDeExecucao = fim - inicio;
                	System.out.println("Tempo de execução: " + tempoDeExecucao + " milissegundos");

                }
        		
        	}
        	
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

