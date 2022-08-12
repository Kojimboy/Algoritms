package Algs;

//итеративный подход
public class Binary_search_2 {
    //для бинарного поиска нужен отсортированный массив
    int[] array ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    public static int count = 0;
    public static int binarySearch(int[] array, int desiredElement){
        int start = 0;
        int end = array.length; //16

        int middle = 0;
        boolean found = false; //флаг для отображения того нашли или нет элемент (не нужен так как если найдет сразу выйдет из цикла
        int position = -1; // если элемент не найден то возвращаем -1

        while(start <= end && start!=array.length) { //последнее условия на то что дошел до конца исходного массива чтоб не выйти за пределы
            count+= 1;
            middle = (start + end)/2;
            if (array[middle] == desiredElement ){
                found = true;
                position = middle;
                return position;
            }
            if (desiredElement < array[middle]){
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return  position;
    }

    public static void setCountZero(){
        count = 0;
    }

    public static int recursiveBinarySearch(int[] array, int desiredElement, int start, int end){
        int middle = (start + end)/2;
        count++;
        if (desiredElement == array[middle])
            return middle;
        if (desiredElement < array[middle])
            return recursiveBinarySearch(array, desiredElement, start, middle -1);
        else
            return recursiveBinarySearch(array, desiredElement,middle + 1, end);
    }


}
