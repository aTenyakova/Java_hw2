import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 7, 10, 3};

        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write("Массив: ");
            Task_1.printArray(arr, fw);

            Task_1.bubbleSort(arr, fw);

            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Task_2.jsonParser();
    }
}
