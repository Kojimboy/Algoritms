package Algs;

public class Bubble_sort_4 {

    public static int count = 0;
    public static int[] bubbleSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 ; j++){ //вложенный цикл сравнивает два близлежащих элемента
                if (array[j+1] < array[j]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                count+=1;
            }

        }
        System.out.println("count = " +count);
        return array;
    }
}
