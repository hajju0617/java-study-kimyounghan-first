package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;    // 5 / 2 = 2.5 but int 형이라 소수점 밑에 값은 없어짐
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
