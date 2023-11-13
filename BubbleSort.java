class BubbleSort {
    private static int numIteracoes = 0;
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int var = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = var;
                }
            }
            numIteracoes++;

            System.out.println("\nIteração " + numIteracoes + ":");
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
