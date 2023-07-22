import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        int[] selections = {13, 46, 24, 52, 20, 9};
        selsectionSort(selections);
        int[] bubble = {13, 46, 24, 52, 20, 9};
        bubbleSort(bubble);
        int[] insersion = {13, 46, 24, 52, 20, 9};
        insertsionSort(insersion);

        int[] pair = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        slidingWindow(pair, k);

        int[] merge = {3, 2, 4, 1, 3};
        int l = 0, r = merge.length - 1;
        mergeSort(merge, r, l);
        System.out.println(Arrays.toString(merge));

        int[] quick = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(quick, 0, quick.length - 1);
        System.out.println(Arrays.toString(quick));


        int[] bubblerec = {13, 46, 24, 52, 20, 9};
        bubblerecSort(bubblerec, bubblerec.length);
        System.out.println(Arrays.toString(bubblerec));

        int[] insertionrec = {13, 46, 24, 52, 20, 9};
        insertionrecSort(insertionrec, 1);
        System.out.println(Arrays.toString(insertionrec));
    }

    private static void insertionrecSort(int[] insertionrec, int i) {
        if (i == insertionrec.length ){
            return;
        }

        int j = i;
        while (j > 0 && insertionrec[j] < insertionrec[j - 1]) {
            int temp = insertionrec[j];
            insertionrec[j] = insertionrec[j - 1];
            insertionrec[j - 1] = temp;
            j--;
        }
        insertionrecSort(insertionrec, i + 1);
    }

    private static void bubblerecSort(int[] bubblerec, int length) {
        if (length == 1){
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            if (bubblerec[i] > bubblerec[i + 1]) {
                int temp = bubblerec[i];
                bubblerec[i] = bubblerec[i + 1];
                bubblerec[i + 1] = temp;
            }
        }

        bubblerecSort(bubblerec, length - 1);
    }


    private static void quickSort(int[] quick, int start, int end) {
        if (start < end){
            int pivot =  ppoint(quick, start, end);
            quickSort(quick, start, pivot - 1);
            quickSort(quick, pivot + 1, end);
        }
    }

    private static int ppoint(int[] quick, int start, int end) {
        int pivot = quick[start];
        int i = start, j = end;
        while (i < j){
            while (quick[i] <= pivot && i <= end - 1) {
                i++;
            }
            while (quick[j] > pivot && j >= start + 1) {
                j--;
            }
            if (i < j){
                int temp = quick[i];
                quick[i] = quick[j];
                quick[j] = temp;
            }
        }
        int temp = quick[start];
        quick[start] = quick[j];
        quick[j] = temp;
        return j;
    }

    private static void mergeSort(int[] merge, int length, int i) {
        if (i == length) return;

        int mid = i + (length - i) / 2;
        mergeSort(merge, mid, i);
        mergeSort(merge, length, mid + 1);
        mergeArray(merge, i, mid, length);

    }

    private static void mergeArray(int[] merge, int i, int mid, int length) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = i;
        int right = mid + 1;
        while (left <= mid && right <= length){
             if (merge[left] <= merge[right]){
                 al.add(merge[left]);
                 left++;
             }else {
                 al.add(merge[right]);
                 right++;
             }
        }
         while (left <= mid){
            al.add(merge[left]);
            left++;
        }
        while (right <= length){
            al.add(merge[right]);
            right++;
        }
        for (int j = i; j <= length; j++) {
            merge[j] = al.get(j - i);
        }
    }


    private static void slidingWindow(int[] pair, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += pair[i];
        }

        int large = sum;
        for (int i = k; i < pair.length; i++) {
            sum += pair[i];
            sum -= pair[i - k];
            if (sum > large) large = sum;
        }
        System.out.println(large);
    }

    private static void insertsionSort(int[] insersion) {
        for (int i = 1; i < insersion.length; i++) {
            int j = i;
            while (j > 0 && insersion[j - 1] > insersion[j]){
                int temp2 = insersion[j - 1];
                insersion[j - 1] = insersion[j];
                insersion[j] = temp2;
                j--;
            }
        }
        System.out.println(Arrays.toString(insersion));
    }

    private static void bubbleSort(int[] bubble) {
        for (int i = 1; i < bubble.length; i++) {
            int stop = 0;
            for (int j = 0; j < bubble.length - i; j++) {
                if (bubble[j] > bubble[j + 1]){
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                    stop = 1;
                }
            }
            if (stop == 0) break;
        }
        System.out.println(Arrays.toString(bubble));
    }

    private static void selsectionSort(int[] selections) {
        for (int i = 0; i < selections.length - 1; i++) {
            int min = i;
            for (int j = i; j < selections.length; j++) {
                if (selections[min] > selections[j]) min = j;
            }
            int temp = selections[i];
            selections[i] = selections[min];
            selections[min] = temp;
        }
        System.out.println(Arrays.toString(selections));
    }
}
