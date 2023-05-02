import java.util.ArrayList;
import java.util.List;

public class Home1002 {

    public static void main(String[] args) {
        int n = 1000;
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000: " + primes);
    }
}