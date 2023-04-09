# Mukanova Amina, SE-2215, 221250
#Laboratory 1
Problem 1.
You are given a number “n” and an array of “n” elements,
write the function that returns minimum of them

public static int findMinFromArr(int[] arr, int n) { //function find minimum value from array list
        if (n == 1)
            return arr[0];//if n is equals to 1, function will return the first element of array
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);//in other case, function will compare arr[n-1] with arr[n-2] and continue and return minimum of them
        }
    }
    
Problem 2.
You are given a number “n” and an array of “n” elements,
write the function that returns average of them

public static float findSum(int n, int[] arr) {//function find summary of array
        int a = arr[n - 1];
        if (n == 1)
            return a;//if n is equals to 1, function will return the first element of array
        return a + findSum(n - 1, arr);//in other case, function will find summary of all elements
    }
    public static float findAverage(int n, int[] arr) {//function find average
        float avr = findSum(Integer.valueOf(n), arr);
        return avr / n;//return average (sum divided by count of elements)
    }

Problem 3.
You are given a number “n”, write the function for checking
whether“n” is prime.

 public static boolean checkPrime(int n) { //function check does element is prime element
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
                break;//if number is not prime will be false and function stop
            }
        }
            if (isprime)
                System.out.printf("Prime", n);
            else
                System.out.printf("Composite", n);
        }
        return isprime;
    }
    
   
Problem 4.
You are given a number “n”, write the program using recursion for
finding “n!”

 public static int findFactorial(int n) { //function find factorial of number 
        if (n == 1 || n == 0)
            return 1; //the factorial of 1 and 0 is 1, so return 1
        else {
            int factor = (int) (n * findFactorial(n - 1));
            return factor; //return evaluatedfactorial by the formula

        }
    }

You are given a number “n”, write the function for finding n-th
elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
F0= 0, F1 = 1

public static int findFibonacci(int n) {//function find n-th Fibonacci number 
        if (n == 1)
            return 1;//1 fib.number is 1 so return 1 
        if (n == 0)
            return 0;//0 fib.number is 0 so return 0 
        else {
            int fibon = findFibonacci(n - 1) + findFibonacci(n - 2);
            return fibon;//in other case return fibonacci number by formula

        }
    }
    
Problem 6.
You are given numbers “a” and “n”, write the function that
returns "a^n"    

public static int findPower(int a, int n) {// function find power of a 
        int pow = 1;
        for (int i = 0; i < n; i++) {
            pow *= a;
        }
        return pow;//return power of a using loop
    }
    
    
    
    
    
    
    
    
    
    
    
