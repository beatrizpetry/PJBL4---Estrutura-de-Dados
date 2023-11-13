public class QuickSort {
    private static int numIteracoes = 0;
    public static void quickSort(int[] array, int menor, int maior) {
        if (menor < maior) {
            numIteracoes++;
            int indicePivot = partition(array, menor, maior);
            quickSort(array, menor, indicePivot - 1);
            quickSort(array, indicePivot + 1, maior);
        }
    }

    public static int partition(int[] array, int menor, int maior) {
        int pivot = array[maior];// o pivot sempre é o ultimo elemento da array
        int i = menor - 1;

        for (int j = menor; j < maior; j++) {
            if (array[j] <= pivot) {
                i++;
                int var = array[i];
                array[i] = array[j];
                array[j] = var;
            }
        }
        int var = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = var;
        System.out.println("\nIteração " + numIteracoes + ":");
        printArray(array, true);

        return i + 1;
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
