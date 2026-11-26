public class Fibonacci_assignment {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.println("Assignment to print first 100 fibonacci numbers:");
        for (int i = 1; i <= 100; i++) {

            System.out.println(first);

            int next = first + second;

            first = second;
            second = next;
        }
    }
}