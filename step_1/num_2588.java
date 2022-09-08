package step_1;

import java.util.Scanner;

public class num_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int num_1 = A * (B - ((B / 100) * 100) - (((B - B / 100 * 100) / 10) * 10));
        int num_2 = A * ((B - B / 100 * 100) / 10);
        int num_3 = A * (B / 100);
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_1 + num_2 * 10 + num_3 * 100);
    }
}
