//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.(через FileWriter).

import java.io.FileWriter;
import java.io.IOException;

public class Task_1 {
    public static void bubbleSort(int[] arr, FileWriter fw) throws IOException {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            fw.write("Итерация " + (i + 1) + ": ");
            printArray(arr, fw);

            if (!swapped) {
                break;
            }
        }
        fw.write("Результат: ");
        printArray(arr, fw);
    }


    public static void printArray(int[] arr, FileWriter fw) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            fw.write(arr[i] + " ");
        }
        fw.write("\n");
    }
}