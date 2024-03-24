public class SortMethods {

    public static void selectionSort(Item[] item) {
        for (int i = 0; i < item.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < item.length; j++) {
                if (item[j].getRating()> item[min_idx].getRating()) {
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
