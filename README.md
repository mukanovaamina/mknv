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
