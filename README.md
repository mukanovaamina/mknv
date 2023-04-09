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
