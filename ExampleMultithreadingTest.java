import java.util.*;

public class ExampleMultithreadingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int multiplicationNumber = scanner.nextInt();
        MultiplicationTableThread multiplicationTableThread = new MultiplicationTableThread(multiplicationNumber);

        System.out.print("Enter a number for Fibonacci series: ");
        int fibonacciNumber = scanner.nextInt();
        FibonacciSeriesThread fibonacciSeriesThread = new FibonacciSeriesThread(fibonacciNumber);

        System.out.print("Enter a number for factorial series: ");
        int factorialNumber = scanner.nextInt();
        FactorialThread factorialThread = new FactorialThread(factorialNumber);

        multiplicationTableThread.start();
        fibonacciSeriesThread.start();
        factorialThread.start();

        try {
            multiplicationTableThread.join();
            fibonacciSeriesThread.join();
            factorialThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

   
    }
}

class MultiplicationTableThread extends Thread {
    private int multiplicationNumber;

    public MultiplicationTableThread(int multiplicationNumber) {
        this.multiplicationNumber = multiplicationNumber;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", multiplicationNumber, i, multiplicationNumber * i);
        }
    }
}

class FibonacciSeriesThread extends Thread {
    private int fibonacciNumber;

    public FibonacciSeriesThread(int fibonacciNumber) {
        this.fibonacciNumber = fibonacciNumber;
    }

    public void run() {
        int a = 0, b = 1;

        System.out.printf("Fibonacci series upto %d terms:\n", fibonacciNumber);
        for (int i = 1; i <= fibonacciNumber; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}

class FactorialThread extends Thread {
    private int factorialNumber;

    public FactorialThread(int factorialNumber) {
        this.factorialNumber = factorialNumber;
    }

    public void run() {
        System.out.printf("Factorial numbers upto %d:\n", factorialNumber);
        for (int i = 1; i <= factorialNumber; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%d! = %d\n", i, factorial);
        }
    }
}
