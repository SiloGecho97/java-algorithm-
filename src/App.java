public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPrime(23));
    }

    static boolean isPrime(int n) {
        // Base cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        // only check cases in Form 6k ± 1
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
