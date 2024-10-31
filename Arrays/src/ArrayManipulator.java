import java.sql.SQLOutput;
import java.util.*;

enum Direction {
    RIGHT,
    LEFT
}

public class ArrayManipulator {
    static int findMaxValue(int[] array) {
        try {
            if (array.length == 0) {
                throw new NullPointerException("Cannot iterate over empty array.");
            }

            int maxValue = array[0];
            for (int val : array) {
                if (val > maxValue) {
                    maxValue = val;
                }
            }
            return maxValue;
        } catch (Exception e) {
            throw e;
        }
    }

    // we can do the same for min value

    static boolean isSorted(int[] array1) {
        int[] arrayCopy = array1.clone();
        Arrays.sort(arrayCopy);
        return Arrays.equals(arrayCopy, array1);
    }

    static int[] removeDuplicates(int[] array) {
        Set<Integer> insertedValues = new HashSet<>();
        List<Integer> filteredArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!insertedValues.contains(array[i])) {
                filteredArray.add(array[i]);
                insertedValues.add(array[i]);
            }
        }

        int[] resultArray = new int[filteredArray.size()];
        for (int i = 0; i < filteredArray.size(); i++) {
            resultArray[i] = filteredArray.get(i);
        }
        return resultArray;
    }

    static int[] rotateArray(int[] arrayToRotate, Direction direction, int steps) {
        int[] resultArray = new int[arrayToRotate.length];
        if (direction == Direction.RIGHT) {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[(i + steps) % resultArray.length] = arrayToRotate[i];
            }
        }

        if (direction == Direction.LEFT) {
            for (int i = resultArray.length - 1; i >= 0; i--) {
                int nextPosition = ((i + steps) % resultArray.length) % resultArray.length;
                resultArray[nextPosition] = arrayToRotate[i];
            }
        }
        return resultArray;
    }

    /* MUST IMPROVE */
    static int minRemovalForMountain(int[] nums) {
        int greatestValue = nums[0];
        int greatestValueIndex = 0;
        List<Integer> lis = new ArrayList<>();
        List<Integer> lds = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > greatestValue) {
                greatestValue = nums[i];
                greatestValueIndex = i;
            }
        }

        int[] left = Arrays.copyOfRange(nums, 0, greatestValueIndex);
        int[] right = Arrays.copyOfRange(nums, greatestValueIndex + 1, nums.length);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        /*
            Iterate through either side to find the longest sequences
        */
        int leftLongestSeq = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] < leftLongestSeq) {

            }
        }

        return 1;
    }

    static int[] bubbleSort(int[] arrayToSort) {
        int counter = arrayToSort.length;
        /*  Aninhei o while com o for loop porque li o conceito aqui
            https://www.javatpoint.com/bubble-sort-in-java
            e tentei incorporar da minha maneira.
            Apenas com a lógica, sem ler o código, consegui fazer o bubble sort com sucesso.
        */
        while (counter > 0) {
            for (int i = 0; i < counter - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
            }
            counter--;
        }
        System.out.println(Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
