package LEETCODE;

public class TimeComplexity {

    // is a measure of how  the runtime of ana algorithm grows with a size of the input
    // helps to understand how fast your alg
    // only based on worst case scenario

    /*
        1. Big O of 1: O(1) -> constant time complexity
            Ex:
                nums[4]
                map.get(key)
        2. O(logN) -> N is the size of your input
            EX:
                binary search
        3. O(N) -> linear time complexity.
            EX:
                Find the max element from array. 1 for loop
        4. O(N-square) -> quadratic time complexity, Nested loop
        5. O(2 the power of N) -> Exponential time complexity.
            EX:
                recursive fib(n) .... return fib(n-1) + fib(n-2);
     */

    public static void main(String[] args) {

        /*
                get value from map: O(1)
                for {} // 1000
                for {} // 1000
                2000 : linear
                for{ for{} } 1000*1000 = 1000000
         */

    }

}
