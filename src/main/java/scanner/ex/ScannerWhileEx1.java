package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요. (종료를 입력하면 종료 됩니다.) : ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.print("프로그램 종료");
                return;
            }

            System.out.print("나이를 입력하세요. : ");
            int age = input.nextInt();  // 10(Enter) -> 10\n -> nextInt는 10만 가져가고 \n은 남아있는 상태로 nextLine이 읽어버려서
                                        // 코드가 원하는대로 실행되지 않음 따라서 nextLine() 을 한번 써서 남은 \n을 소거해줘야함
//            input.nextLine();
            System.out.println("입력한 이름: " + name + ", 나이 : " + age);
        }
    }
}
