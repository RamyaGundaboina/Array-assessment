import java.util.Arrays;
import java.util.Scanner;

public class ProblemArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum=0;

        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        a[n-1]  = sum;

        System.out.println(Arrays.toString(a));

        sc.close();
    }
}
