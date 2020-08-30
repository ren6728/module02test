package problems;



public class FibonacciSeries {
    public static void main(String[] args) {
        //fibonacciSeries(100);
        /**
     * Write a function to find fibonacciSerie of 100
     * */
        int n, a = 0, b = 0, c = 1;
            System.out.print("Fibonacci Series:");
            for(int i = 1; i <= 100; i++)
            {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+" ");
            }
        }
        }





