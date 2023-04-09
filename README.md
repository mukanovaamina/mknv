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
