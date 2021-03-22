package exercises;

public class FibonacciTest {

    static int timesCalled = 0;
    static int timesCalled2 = 0;

    public static long fib(int n) {
        timesCalled++;
        if (n <= 1) {
            return n; }
        else {
            return (fib(n-1) + fib(n-2));
        }

    }

    public static int getTimesCalled() {
        return timesCalled;
    }

    public static int getTimesCalled2() {
        return timesCalled2;
    }

    public static long mfib(int n) {

        int[] tempArray;
        tempArray = new int[n+1];
        return memo(n, tempArray);
    }

    private static long memo(int n, int[] x) {


        timesCalled2++;
        int[] tempArray = x;
        if (n <= 1) {
            return n;
        }
        else if (tempArray[n] != 0) {
            return tempArray[n];
        }
        else {
            tempArray[n] = (int) (memo(n-1, tempArray) + memo(n-2,tempArray));
            return tempArray[n];
        }
    }

    public static long ifib(int n) {

        int temp0 = 0;
        int temp1 = 1;
        int temp2 = 1;
        for (int i = 0; i < n; i++) {
            temp0 = temp1;
            temp1 = temp2;
            temp2 = temp0 + temp1;
        }
        return temp0;
    }

    public static void testRecursive(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
    }

    public static void testMemoization(){}
    public static void testIterative(){}

    public static void main(String[] args) {

int testNum = 8;
System.out.println(fib(testNum));
System.out.println("Basic alg times called: " + getTimesCalled());
System.out.println(mfib(testNum));
System.out.println("Memoized alg times called: " + getTimesCalled2());
System.out.println(ifib(testNum));

        testNum = 21;
        System.out.println(fib(testNum));
        System.out.println("Basic alg times called: " + getTimesCalled());
        System.out.println(mfib(testNum));
        System.out.println("Memoized alg times called: " + getTimesCalled2());
        System.out.println(ifib(testNum));

        testNum = 42;
        System.out.println(fib(testNum));
        System.out.println("Basic alg times called: " + getTimesCalled());
        System.out.println(mfib(testNum));
        System.out.println("Memoized alg times called: " + getTimesCalled2());
        System.out.println(ifib(testNum));
    }
}
