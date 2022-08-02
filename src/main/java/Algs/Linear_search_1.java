package Algs;


public class Linear_search_1 {
    static int count = 0;
    //линейный поиск
    public static Object linearSearch(int[] array, int desiredElement){
        for (int i = 0; i < array.length; i++ ){
            count +=1;
            if (array[i] == desiredElement) {
                System.out.println("count = " + count);
                return i; //возвращает индекс найденного элемента
            }
        }
        System.out.println(count);
        return null; //возврат нуля если не нашел ничего
    }

}