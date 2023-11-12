public class QuickSort {

    private static int numIteracoes = 0;

    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array inicial:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray final ordenado:");
        printArray(array);
    }

    public static void quickSort(int[] array, int menor, int maior) {
        if (menor < maior) {
            numIteracoes++;
            int indicePivot = partition(array, menor, maior); // Escolhendo o pivô como o último elemento do array
            quickSort(array, menor, indicePivot - 1);
            quickSort(array, indicePivot + 1, maior);
        }
    }

    public static int partition(int[] array, int menor, int maior) {
        int pivot = array[maior];
        int i = menor - 1;

        for (int j = menor; j < maior; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;
        System.out.println("\nIteração " + numIteracoes + ":");
        printArray(array);

        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
