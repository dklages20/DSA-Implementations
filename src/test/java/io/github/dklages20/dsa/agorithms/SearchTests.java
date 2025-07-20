package io.github.dklages20.dsa.agorithms;

import io.github.dklages20.dsa.algorithms.Search;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTests {

    @Nested
    class LinearSearchTests {

        @Test
        @DisplayName("Returns -1 whenever the input array is null")
        void test1() {
            assertEquals(-1, Search.linearSearch(null, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the input array is empty")
        void test2() {
            assertEquals(-1, Search.linearSearch(new int[]{}, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the value is not in the array")
        void test3() {
            assertEquals(-1, Search.linearSearch(new int[]{1, 2, 3, 4}, 6));
        }

        @Test
        @DisplayName("Returns the index of the value in the array")
        void test4() {
            assertEquals(2, Search.linearSearch(new int[]{1, 2, 3, 4}, 3));
        }
    }

    @Nested
    class BinarySearchTests {

        @Test
        @DisplayName("Returns -1 whenever the input array is null")
        void test1() {
            assertEquals(-1, Search.binarySearch(null, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the input array is empty")
        void test2() {
            assertEquals(-1, Search.binarySearch(new int[]{}, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the value is not in the array")
        void test3() {
            assertEquals(-1, Search.binarySearch(new int[]{1, 2, 3, 4}, 6));
        }

        @Test
        @DisplayName("Returns the index of the value in the array")
        void test4() {
            assertEquals(2, Search.binarySearch(new int[]{1, 2, 3, 4}, 3));
        }

        @Test
        @DisplayName("Returns 0 when the value is the first element in the array")
        void test5() {
            assertEquals(0, Search.binarySearch(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, 1));
        }

        @Test
        @DisplayName("Returns the final index when the value is the final element in the array")
        void test6() {
            assertEquals(6, Search.binarySearch(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, 7));
        }

        @Test
        @DisplayName("Returns the index of the value whenever the array is really large")
        void test7() {
            int arraySize = 1_000_000;
            int [] arr = new int[arraySize];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            assertEquals(9, Search.binarySearch(arr, 9));
        }
    }

    @Nested
    class BinarySearchRecursiveTests {
        @Test
        @DisplayName("Returns -1 whenever the input array is null")
        void test1() {
            assertEquals(-1, Search.binarySearchRecursive(null, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the input array is empty")
        void test2() {
            assertEquals(-1, Search.binarySearchRecursive(new int[]{}, 1));
        }

        @Test
        @DisplayName("Returns -1 whenever the value is not in the array")
        void test3() {
            assertEquals(-1, Search.binarySearchRecursive(new int[]{1, 2, 3, 4}, 6));
        }

        @Test
        @DisplayName("Returns the index of the value in the array")
        void test4() {
            assertEquals(2, Search.binarySearchRecursive(new int[]{1, 2, 3, 4}, 3));
        }

        @Test
        @DisplayName("Returns 0 when the value is the first element in the array")
        void test5() {
            assertEquals(0, Search.binarySearchRecursive(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, 1));
        }

        @Test
        @DisplayName("Returns the final index when the value is the final element in the array")
        void test6() {
            assertEquals(6, Search.binarySearchRecursive(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, 7));
        }

        @Test
        @DisplayName("Returns the index of the value whenever the array is really large")
        void test7() {
            int arraySize = 1_000_000;
            int [] arr = new int[arraySize];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }

            assertEquals(9, Search.binarySearchRecursive(arr, 9));
        }
    }
}
