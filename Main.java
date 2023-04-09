
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMinFromArr(arr, n);
        System.out.println(min);

        float avr = findAverage(n, arr);
        System.out.println(avr);


        int factor = findFactorial(n);
        System.out.println(factor);

        int fibon = findFibonacci(n);
        System.out.println(fibon);

        int pow = findPower(a, n);
        System.out.println(pow);

        int[] revArr = findReverse(arr, n);
        System.out.println(revArr);


        Scanner sca = new Scanner(System.in);
        System.out.print("\n"+"Enter a string to check is all consists of digits: ");
        String s = sca.nextLine();

        boolean checkIsDigit=checkIsDigit(s);
        if (checkIsDigit){
            System.out.println(("yes"));
        }
        else {
            System.out.println(("no"));
        }


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


    public static int findFactorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else {
            int factor = (int) (n * findFactorial(n - 1));
            return factor;

        }
    }


    public static int findFibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        else {
            int fibon = findFibonacci(n - 1) + findFibonacci(n - 2);
            return fibon;

        }
    }

    public static int findPower(int a, int n) {
        int pow = 1;
        for (int i = 0; i < n; i++) {
            pow *= a;
        }
        return pow;
    }

    public static int[] findReverse(int[] arr, int n) {
        int[] revArr = new int[n];
        for (int i = 0; i < n; i++) {
            revArr[i]=arr[n - 1 - i];
        }
        return revArr;
    }


    public static boolean checkIsDigit(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }


}

