import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] targetArray = new int[]{1, 2, 4, 7, 5, 5, 3};
        int[] anotherArray = new int[]{2, 37, 1, 32, 125, 0, -3};

        int[] result = ArrayManipulator.concat(targetArray, anotherArray);
        ArrayManipulator.bubbleSort(result);
        System.out.println(Arrays.toString(result));
    }
}