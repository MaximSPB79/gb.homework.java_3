package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeworkGeneric<T> {

    T[] array;
    private T temp;

    public HomeworkGeneric() {

    }

    private void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    private void swapTwoElementsInArray(T[] array, int firstNumPos, int secondNumPos) {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            System.out.println("Неправильно указаны позиции элементов для замены");
        } else {
            temp = array[firstNumPos];
            array[firstNumPos] = array[secondNumPos];
            array[secondNumPos] = temp;
        }
    }

    private ArrayList<T> changeArrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {

        // задание 1
        System.out.println("Задание № 1 \n");


        HomeworkGeneric<Integer> obInt = new HomeworkGeneric<>();
        HomeworkGeneric<String> obString = new HomeworkGeneric<>();
        HomeworkGeneric<Double> obDouble = new HomeworkGeneric<>();

        Integer[] array = {1, 2, 5, 6, 89};
        String[] strArray = {"a", "b", "H", "P"};

        obInt.printArray(array);
        obInt.swapTwoElementsInArray(array, 1, 4);
        obInt.printArray(array);

        obString.printArray(strArray);
        obString.swapTwoElementsInArray(strArray, 0, 3);
        obString.printArray(strArray);
        System.out.println();


        // задание 2
        System.out.println("Задание № 2 \n");

        Integer[] number = {1, 5, 3, 8, 10};

        ArrayList<Integer> listInt = obInt.changeArrayToList(number);
        System.out.println(listInt.size());
        System.out.println(listInt.get(4));
        System.out.println(listInt);
        System.out.println();

        String[] strings = {"груша", "яблоко", "арбуз", "малина"};

        ArrayList<String> listString = obString.changeArrayToList(strings);
        System.out.println(listString.size());
        System.out.println(listString.get(2));
        System.out.println(listString);

    }
}
