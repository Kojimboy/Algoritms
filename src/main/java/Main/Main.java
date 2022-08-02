package Main;

import java.util.Arrays;

import static Algs.Bubble_sort_4.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[26]; // количество элементов задаем

        int[] array2 ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //линейный поиск
//      System.out.println(Arrays.toString(rand(array,10,20)) + "\n"+ linearSearch(array,10));

        //бинарный поиск
//      System.out.println(binarySearch(array2,7));
//      System.out.println(count);

        //сортировка выборов
//        System.out.println(Arrays.toString(rand(array, -10, 20)));
//        System.out.println(Arrays.toString(selectSort(array)));
       // System.out.println(Arrays.toString(bubbleSort(rand(array, -10, 20))));
        System.out.println(Arrays.toString(bubbleSort(rand(array, -10, 20))));
    }

    //метод для рандомного заполнения массива
    public static int[] rand(int[] array1, int begin, int end){
        for (int i = 0; i < array1.length; i++ ){
            array1[i] = (int) (Math.random() * (end - begin + 1)) + begin; // рандом [-15,15]
        }
        return array1; //меняет значение поступившего массива если что
    }

}
