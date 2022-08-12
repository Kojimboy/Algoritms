package Algs;

import java.util.Arrays;

public class Quick_sort_5 {
    public static int count = 0;

    public static void quickSort(int[] array, int from, int to) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (from >= to)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = from + (to - from) / 2;
        int pivot = array[middle]; //опорный элемент

        // разделить на подмассивы, который больше и меньше опорного элемента
        int leftIndex = from, rightIndex = to;

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {//меняем местами
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
            count++;
        }

        // вызов рекурсии для сортировки левой и правой части
        if (from < rightIndex)
            quickSort(array, from, rightIndex);

        if (to > leftIndex)
            quickSort(array, leftIndex, to);
    }


}
