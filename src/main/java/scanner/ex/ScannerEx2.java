package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요. : ");
        int num = scanner.nextInt();

        String str = "";
        if (num == 0) {
            str = "0";
        } else if (num % 2 == 0) {
            str = "짝수";
        } else {
            str = "홀수";
        }
        System.out.println("입력한 정수는 " + str + "입니다");
    }
}
