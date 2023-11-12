public class InsertionSort {
    public static void insertionSort(int[] array) {
        int tamanho = array.length;
        for (int i = 1; i < tamanho; ++i) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;

            System.out.println("Ordenando...");
            printArray(array, true);
        }
    }

    static void printArray(int[] array, boolean withBrackets) {
        for (int i = 0; i < array.length; i++) {
            if (withBrackets) {
                System.out.print("[" + array[i] + "]");
            } else {
                System.out.print(array[i]);
            }
            
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}