package HW1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }

    public static String showTotalAmount(int num) {
        return (num * (num + 1) / 2) + "";
    }
}