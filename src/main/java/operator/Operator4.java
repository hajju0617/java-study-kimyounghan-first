package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);   // 결과는 같지만
                                        // 명시적으로 () 해주는 것이 좋음

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 코드를 몇자 줄여서 모호하거나 복잡해 지는 것 보다는
        // 코드가 더 많더라도 명확하고 단순한 것이 유지보수 하기 좋다
    }
}
