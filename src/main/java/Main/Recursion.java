package Main;

public class Recursion {

    //факториал
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n-1);
    }

    //фибоначи
    public static int fibonachi(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonachi(n-1) + fibonachi(n-2);
    }

}
