import java.util.Arrays;

// Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class task5_3 {
    public static void heap(int[] array, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heap(array, length, largest);
        }
    }

    public static void piramidSort(int[] array) {

        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heap(array, length, i);
        }
        
        for (int i = length - 1; i >= 0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heap(array, i, 0);
        }
    }

    public static void main(String[] args){
        int[] array = {9, 8, 7, 6, 5, 1, 3, 4, 2};
        piramidSort(array);
        System.out.println(Arrays.toString(array));
    }
}
