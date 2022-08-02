package Algs;

public class Select_sort_3 {
    //сортировка выбором
    public static int count = 0;
    public static int[] selectSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++){
            int indexMin = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[indexMin]){
                    indexMin = j;
                }
                count+=1;
            }
            //поменять два элемента местами
            tmp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = tmp;
        }
        System.out.println("count = " + count);
        return array;
    }


}
