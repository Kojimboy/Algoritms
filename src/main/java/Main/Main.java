package Main;

import Algs.Binary_search_2;

import java.util.Arrays;

import static Algs.Bubble_sort_4.*;
import static Algs.Binary_search_2.*;
import static Algs.Quick_sort_5.*;
import static Main.Recursion.*;


public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[26]; // количество элементов задаем
        int[] array2;

        int[] array ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //линейный поиск
//      System.out.println(Arrays.toString(rand(array,10,20)) + "\n"+ linearSearch(array,10));

        //бинарный поиск
//      System.out.println(binarySearch(array2,7));
//      System.out.println(count);

        //сортировка выборов
//        System.out.println(Arrays.toString(rand(array, -10, 20)));
//        System.out.println(Arrays.toString(selectSort(array)));

//        System.out.println(Arrays.toString(bubbleSort(rand(array, -10, 20))));

        //рекурсия
        // System.out.println(fibonachi(8));

        //быстра сортировка и сравнение с пузырьком
//        rand(array1, -10, 20);
//        System.out.println("initial array \n" +Arrays.toString(array1));
//        array2 = array1.clone();
//
//        quickSort(array1, 0, array1.length -1);
//        System.out.println(" quick sorted array \n" +Arrays.toString(array1));
//        System.out.println("count = " +Algs.Quick_sort_5.count + "\n");
//
//        System.out.println("bubble ");
//        System.out.println(Arrays.toString(bubbleSort(array2)));

        //
      System.out.println(binarySearch(array,0));
      System.out.println(Binary_search_2.count);

      setCountZero();

      System.out.println(recursiveBinarySearch(array, 0, 0, array.length));
      System.out.println(Binary_search_2.count);



    }

    //метод для рандомного заполнения массива
    public static int[] rand(int[] array1, int begin, int end){
        for (int i = 0; i < array1.length; i++ ){
            array1[i] = (int) (Math.random() * (end - begin + 1)) + begin; // рандом [-15,15]
        }
        return array1; //меняет значение поступившего массива если что
    }

}
