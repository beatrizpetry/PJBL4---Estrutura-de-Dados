import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        System.out.print("===== PJBL4 - Estrutura de Dados - Algorítmos de Ordenação =====");
        System.out.println();
        System.out.print("Beatriz Petry, Julia Engels e Mariana Camily");
        System.out.println();
        int var = 1;
        while (var != 0){
            Scanner inicio = new Scanner(System.in);
            System.out.println();
            System.out.print("Deseja Realizar [1] Bubble Sort, [2] Insertion Sort ou [3] Quick Sort? (Digite qualquer outro n° para sair): ");
            int resposta = inicio.nextInt();
            int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
            if (resposta == 1) {
                System.out.println();
                System.out.print("===== Opção Selecionada: Bubble Sort =====");
                System.out.println();
                System.out.println("Array inicial:");
                BubbleSort.printArray(array, true);
                System.out.println();

                System.out.println("Ordenação Linha por Linha:");
                BubbleSort.bubbleSort(array);

                System.out.println("\nArray final (ordenado):");
                BubbleSort.printArray(array, true);

            }
            else if (resposta == 2){
                System.out.println();
                System.out.print("===== Opção Selecionada: Insertion Sort =====");
                System.out.println();
                System.out.println("Array inicial:");
                InsertionSort.printArray(array, true);
                System.out.println();

                System.out.println("Ordenação Linha por Linha:");
                InsertionSort.insertionSort(array);

                System.out.println("\nArray final (ordenado):");
                InsertionSort.printArray(array, true);

            }
            else if (resposta == 3){
                System.out.println();
                System.out.print("===== Opção Selecionada: Quick Sort =====");
                System.out.println();
                System.out.println("Array inicial:");
                QuickSort.printArray(array, true);

                QuickSort.quickSort(array, 0, array.length - 1);

                System.out.println("\nArray final (ordenado):");
                QuickSort.printArray(array, true);

            }
            else {
                break;
            }
        }
    }
}