package io.github.dklages20.dsa.algorithms;

public final class Search {

    public static int linearSearch(int[] arr, int n) {
        if(arr == null || arr.length == 0) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int n) {
        if(arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int [] arr, int n) {
        if(arr == null || arr.length == 0) {
            return -1;
        }

        return binarySearchRecursive(arr, n, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int [] arr, int n, int left, int right) {
        if(left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if(arr[mid] == n) {
            return mid;
        } else if (arr[mid] > n) {
            return binarySearchRecursive(arr, n, left, mid - 1);
        } else {
            return binarySearchRecursive(arr, n, mid + 1, right);
        }
    }

    private Search() {}
}
