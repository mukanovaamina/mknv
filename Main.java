
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
        System.out.println("The minimum calue is " + min);

        float avr = findAverage(n, arr);
        System.out.println("The average is " + avr);

        boolean prime = checkPrime(n);
        System.out.println(prime);


        int factor = findFactorial(n);
        System.out.println("The factorial is " + factor);

        int fibon = findFibonacci(n);
        System.out.println("The Fibonacci number is " + fibon);

        int pow = findPower(a, n);
        System.out.println("The powered number is " + pow);

        int revArr = findReverse(arr, n);
        System.out.println("The reverse array is " + revArr);


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

        int binomial = findBinCoeff(a, n);
        System.out.println("The binomial coeficent is" + binomial);

        int gcd=findGCD(a,n);
        System.out.println("The GCD is " + gcd);



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
    public static boolean checkPrime(int n) {
        boolean isprime=true;
        if (n < 2)
            System.out.println("Number needs to be more than 1");
        else if (n
                == 2)
            System.out.println("2 is a Prime number");
        else {
            for (int divisor = 2; divisor <= (n / 2); divisor++) {
                if ((n % divisor) == 0) {
                isprime=false;
                break;
            }
        }
            if (isprime)
                System.out.printf("Prime", n);
            else
                System.out.printf("Composite", n);
        }
        return isprime;
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


    public static int findReverse(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        System.out.print(arr[n - 1] + " ");
        int revArr=findReverse(arr, n - 1);
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


    public static int findBinCoeff(int a, int n) {
        if (n == 0 || n == a) {
            return 1;
        } else {
            int binomial = findBinCoeff(a - 1, n - 1) + findBinCoeff(a - 1, n);
            return binomial;
        }

    }

    public static int findGCD(int a, int n){
        if (n==0){
            return a;
        }
        else{
            int gcd= findGCD(n, a%n);
            return gcd;
        }
    }


}

