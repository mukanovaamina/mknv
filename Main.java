
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinFromArr(arr, n);
        System.out.println(min);

        float avr = findAverage(n, arr);
        System.out.println(avr);



    }

    public static int findMinFromArr(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }

    public static float findSum(int n, int[] arr) {
        int a = arr[n - 1];
        if (n == 1)
            return a;
        return a + findSum(n - 1, arr);
    }

    public static float findAverage(int n, int[] arr) {
        float avr = findSum(Integer.valueOf(n), arr);
        return avr / n;
    }


}

