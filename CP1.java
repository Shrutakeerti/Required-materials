import java.util.Scanner;
public class CP1 {
    public boolean isPowerOfTwo(int n) {
        // Check if n is a power of 2
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        CP1 solution = new CP1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = solution.isPowerOfTwo(n);
        System.out.println(result);
    }
}

