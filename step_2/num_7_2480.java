package step_2;

import java.util.Scanner;

public class num_7_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] numList = {a, b, c};
        if(a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }else if(a == b) {
            System.out.println(1000 + a * 100);
        }else if(b == c) {
            System.out.println(1000 + b * 100);
        }else if(a == c) {
            System.out.println(1000 + a * 100);
        }else {
            int max = numList[0];
            for(int i = 0; i<numList.length; i++) {
                if(numList[i] > max) {
                    max = numList[i];
                }
            }
            System.out.println(max * 1000);
        }

    }
}
