public class SelectionSort {
    public static void selectionSort(Item[] item) {
        for (int i = 0; i < item.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < item.length; j++) {
                if (item[j].getrating()> item[min_idx].getrating()) {
                    min_idx = j;
                }
            }

            // Troca
            Item temp = item[min_idx];
            item[min_idx] = item[i];
            item[i] = temp;
        }
    }
}
